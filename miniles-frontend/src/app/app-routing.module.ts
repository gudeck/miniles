import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ProposicaoReadComponent } from './components/proposicao/proposicao-read/proposicao-read.component';
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
    }



];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {
}
