import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { AbstractService } from "../shared/service/abstract.service";



@Injectable({
    providedIn: 'root'
  })
  export class ProposicaoService extends AbstractService{

constructor(private http: HttpClient){
super(http,'proposicao');

}

  }