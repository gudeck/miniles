import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ProposicaoReadComponent } from './components/proposicao/proposicao-read/proposicao-read.component';
import { ProposicaoUpdateComponent } from './components/proposicao/proposicao-update/proposicao-update.component';
import { ProposicaoComponent } from './components/proposicao/proposicao.component';

const routes: Routes = [
    {
        path: '',
        component: HomeComponent
    },
    {
        path:'proposicao',
        component: ProposicaoComponent
    },
    {
        path: 'proposicao/read/:id',
        component: ProposicaoReadComponent
    },
    {
        path: 'proposicao/update/:id',
        component: ProposicaoUpdateComponent
    },



];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {
}
