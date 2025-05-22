export interface Carrete {
  id: number;
  tipo: string;
  modelo: string;
  precio: number;
  tamanoBobina: number;
  cantidadEnStock: number;
  ratio: string;
  ladoManivela: string;
  imagenes: string[];
  marca_id: { id_marca: number; nombre: string };
}