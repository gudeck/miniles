import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Documento } from 'src/app/models/Documento';
import { Proposicao } from 'src/app/models/Proposicao';
import { ProposicaoService } from 'src/app/service/propsicao.service';

@Component({
  selector: 'app-proposicao-read',
  templateUrl: './proposicao-read.component.html',
  styleUrls: ['./proposicao-read.component.scss']
})
export class ProposicaoReadComponent implements OnInit {
  proposicao = new Proposicao();
  idLoc: number;
  documento = new Documento();

  constructor(private route: ActivatedRoute, private proposicaoService: ProposicaoService, private router: Router) {
 


   }

  ngOnInit(): void {
    this.route.params.subscribe((proposicao: Number) => {
      this.idLoc = proposicao['id'];
    })
    this.proposicaoService.buscar<Proposicao>(this.idLoc).subscribe(element => this.proposicao = element);

  }


  display: boolean = false;

  showDialog() {
    this.display = true;
        }
 
colect(documento: Documento){
  this.documento = documento;
}
voltar(){
  this.router.navigate(['proposicao']);
}
}
