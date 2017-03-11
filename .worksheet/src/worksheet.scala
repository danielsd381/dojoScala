object worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(29); 
  val  lista = List(1,2,3,4);System.out.println("""lista  : List[Int] = """ + $show(lista ));$skip(29); 
  val set = Set(1,2,3,4,5,1);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(42); 
  val mapa = Map(1-> "Luis", 2 -> "Juan");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(22); val res$0 = 
  lista.map{x => x+3};System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(17); val res$1 = 
  lista.map{_+3};System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(8); val res$2 = 
  lista;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(26); val res$3 = 
 
 lista.filter{x => x<2};System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(48); 
 
 val names = List("juan", "Carlos", "daniel");System.out.println("""names  : List[String] = """ + $show(names ));$skip(23); val res$4 = 
 names.map{_.length()};System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(62); 
 
 //Kata 1 Encontrar los pares
 val pares = List.range(1,20);System.out.println("""pares  : List[Int] = """ + $show(pares ));$skip(22); val res$5 = 
 pares.filter{_%2==0};System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(140); 
 
 //Kata 2 --> Encontrar los datos de una persona
 val megaLista = List(List("Andres","24 years","male"),List("daniel","24 years","male"));System.out.println("""megaLista  : List[List[String]] = """ + $show(megaLista ));$skip(40); val res$6 = 
 megaLista.filter{x => x(0)=="Andres" };System.out.println("""res6: List[List[String]] = """ + $show(res$6));$skip(91); 
 
 //kata 3 --> encontrar los numeros primos de una lista
 
 val lista2 = List.range(1,20);System.out.println("""lista2  : List[Int] = """ + $show(lista2 ));$skip(94); val res$7 = 
 lista2.filter{x => lista2.filter{ y => y <= Math.sqrt(x)}.filter{z => x%z == 0}.length == 1};System.out.println("""res7: List[Int] = """ + $show(res$7))}
 
}
