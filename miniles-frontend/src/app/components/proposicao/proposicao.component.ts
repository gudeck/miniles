
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Proposicao } from 'src/app/models/Proposicao';
import { ProposicaoList } from 'src/app/models/ProposicaoList';
import { ProposicaoService } from 'src/app/service/propsicao.service';

@Component({
  selector: 'app-proposicao',
  templateUrl: './proposicao.component.html',
  styleUrls: ['./proposicao.component.scss']
})
export class ProposicaoComponent implements OnInit {

  proposicaoList: ProposicaoList[] = [];
  selecaoPropsicaoList = new ProposicaoList;
  
      colunas: any[];
  
      first = 0;
  
      rows = 10;
  
      constructor(private proposicaoService: ProposicaoService, private router: Router) {
          
       }
  
      ngOnInit() {
          this.proposicaoService.listar<ProposicaoList>().subscribe(element => this.proposicaoList = element);

  
      }

      urgencia(){
        

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
          return this.first === (this.proposicaoList.length - this.rows);
      }
  
      isFirstPage(): boolean {
          return this.first === 0;
      }

      isBotaoDesativado(): boolean{
          return !this.selecaoPropsicaoList;

      }
      navigateToReadP(){
        this.router.navigate(['proposicao/read', this.selecaoPropsicaoList.id]);
      }

      display: boolean = false;

    showUpdate(){
        this.display = true;
    }

  
  }