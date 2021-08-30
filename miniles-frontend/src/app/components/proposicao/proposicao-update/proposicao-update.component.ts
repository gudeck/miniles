import { Component, Input, OnInit } from '@angular/core';
import { Proposicao } from 'src/app/models/Proposicao';

@Component({
  selector: 'app-proposicao-update',
  templateUrl: './proposicao-update.component.html',
  styleUrls: ['./proposicao-update.component.css']
})
export class ProposicaoUpdateComponent implements OnInit {


  @Input() proposicao!: Proposicao;


  constructor() { }

  ngOnInit(): void {
  }

}
