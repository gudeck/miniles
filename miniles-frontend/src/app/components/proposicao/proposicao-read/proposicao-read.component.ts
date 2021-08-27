import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Proposicao } from 'src/app/models/Proposicao';
import { TipoProposicao } from 'src/app/models/TipoProposicao';
import { ProposicaoService } from 'src/app/service/propsicao.service';

@Component({
  selector: 'app-proposicao-read',
  templateUrl: './proposicao-read.component.html',
  styleUrls: ['./proposicao-read.component.css']
})
export class ProposicaoReadComponent implements OnInit {
  proposicao: Proposicao;
  tipoProposicao: TipoProposicao[];
  idLoc: number;

  constructor(private route: ActivatedRoute, private proposicaoService: ProposicaoService) {
 


   }

  ngOnInit(): void {
    this.route.params.subscribe((proposicao: Number) => {
      this.idLoc = proposicao['id'];
    })
    this.proposicaoService.buscar<Proposicao>(this.idLoc).subscribe(element => this.proposicao = element);

  }


}
