import { Documento } from "./Documento";
import { TipoProposicao } from "./TipoProposicao";

export class Proposicao{

id?: number;
ementa: String;
regimeDeUrgencia: boolean;
tipoPtoposicao: TipoProposicao;
documentos?: Documento[];

}