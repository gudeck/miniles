import { HttpClient } from '@angular/common/http';
import { Table } from 'primeng';
import { environment } from '../../../environments/environment';
import { Page } from '../model/page';
import { RequestUtil } from '../util/request-util';

export abstract class AbstractService {

    protected readonly url: string;
    protected readonly httpClient: HttpClient;

    protected constructor(http: HttpClient, resource: string) {
        this.httpClient = http;
        this.url = `${ environment.apiUrl }/${ resource }`;
    }

    atualizar<T>(object: Object) {
        return this.httpClient.put<T>(`${ this.url }`, object);
    }

    buscar<T>(id: number | string) {
        return this.httpClient.get<T>(`${ this.url }/${ id }`);
    }

    criar<T>(object: Object) {
        return this.httpClient.post<T>(`${ this.url }`, object);
    }

    excluir(id: number | string) {
        return this.httpClient.delete<void>(`${ this.url }/${ id }`);
    }

    filtrar<T>(object: Object, table: Table) {
        return this.httpClient.get<Page<T>>(`${ this.url }/filtrar`,
            { params: RequestUtil.concatParams([RequestUtil.getFilterParams(object), RequestUtil.getTableParams(table)]) });
    }

    listar<T>() {
        return this.httpClient.get<T[]>(`${ this.url }`);
    }

}
