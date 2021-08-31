import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { SelectItem } from 'primeng';
import { Documento } from 'src/app/models/Documento';
import { Proposicao } from 'src/app/models/Proposicao';
import { ProposicaoList } from 'src/app/models/ProposicaoList';
import { TipoProposicao } from 'src/app/models/TipoProposicao';
import { ProposicaoService } from 'src/app/service/propsicao.service';
import { TipoProposicaoService } from 'src/app/service/tipoProposicao.service';

@Component({
  selector: 'app-proposicao-update',
  templateUrl: './proposicao-update.component.html',
  styleUrls: ['./proposicao-update.component.scss']
})
export class ProposicaoUpdateComponent implements OnInit {
  tipos: SelectItem[];
  idLocal: number;
  value: boolean;
  documento = new Documento();
  proposicao = new Proposicao();
  // proposicao = new Proposicao() ={
  //   id = this.proposicaoList.id,
  //   ementa:'',
  //   regimeDeUrgencia: null,
  //   tipoProposicao:{
  //     sigla: '',
  //     nome: ''
  //   }


  



  constructor(private proposicaoService: ProposicaoService, private tipoProposicaoService: TipoProposicaoService, private route: ActivatedRoute, private router: Router) { }


  ngOnInit(): void {
    this.route.params.subscribe((proposicao: Number) => {
      this.idLocal = proposicao['id'];
    })

    this.tipoProposicaoService.listar<TipoProposicao>()
     
    .subscribe(element => this.tipos = element.map(tipo => ({value: tipo.id, label: `${tipo.nome} - ${tipo.sigla}`})))


    this.proposicaoService.buscar<Proposicao>(this.idLocal).subscribe(element => this.proposicao = element);
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
