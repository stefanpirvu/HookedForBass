export interface Cania {
  id_cania: number;
  tipo: string;
  modelo: string;
  precio: number;
  pies: string;
  accion: string;
  dureza: string;
  rango_peso_seniuelos: string;
  cantidad_en_stock: number;
  imagenes: string[];
  id_marca: { id_marca: number; nombre: string };
}