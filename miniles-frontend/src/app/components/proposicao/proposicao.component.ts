import { listLazyRoutes } from '@angular/compiler/src/aot/lazy_routes';
import { Component, OnInit } from '@angular/core';
import { Button } from 'primeng';
import { Proposicao } from 'src/app/models/Proposicao';
import { ProposicaoService } from 'src/app/service/propsicao.service';

@Component({
  selector: 'app-proposicao',
  templateUrl: './proposicao.component.html',
  styleUrls: ['./proposicao.component.scss']
})
export class ProposicaoComponent implements OnInit {

  proposicao: Proposicao[] = [];
  
      colunas: any[];
  
      first = 0;
  
      rows = 10;
  
      constructor(private proposicaoService: ProposicaoService) {
          
       }
  
      ngOnInit() {
          this.proposicaoService.listar<Proposicao>().subscribe(element => this.proposicao = element);
  
        //   this.colunas = [
              
        //       { field: 'ementa', header: 'Ementa' },
        //       { field: 'regimeDeUrgencia', header: 'Regime de Urgência' },
        //       { field: 'tipoProposicao', header: 'Tipo Proposiçao'},
        //       { field: 'id', header: 'Numero Do Documento' }
        //   ];
      }
  
      next() {
          this.first = this.first + this.rows;
      }
  
      prev() {
          this.first = this.first - this.rows;
      }
  
      reset() {
          this.first = 0;
      }
  
      isLastPage(): boolean {
          return this.first === (this.proposicao.length - this.rows);
      }
  
      isFirstPage(): boolean {
          return this.first === 0;
      }
  
  }