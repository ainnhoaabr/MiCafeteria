 # Gestión de tickets de una cafetería
 
## Descripción

Mi programa se ha creado para poder tener una gestión de tickets en una cafetería en la que pondra los productos que se han consumido, con su respectivo precio y se hara el calculo total de estos, a parte se le aplicaran descuentos si los tiene.

## FUNCIONES
- Añadir productos al ticket.
- Mostrar los productos consumidos y su precio.
- Calcular el coste total del ticket.
- Si un producto tiene descuento, aplicarlo.
  - Mostrar el precio final con descuento (si hay).

## Tecnologías utilizadas

- JAVA
- IntelliJ IDEA
- Git
- GitHub

## Estructura del proyecto

-Producto: en esta clase se representa los productos disponibles de la cafetería.
- Bebida: en esta clase se representan las bebidas que hay como productos.
- Comida: en esta clase se representan las comidas que hay como productos.
- Cliente: representa al cliente que realiza el pedido, sus datos.
- Camarero: representa al camarero que gestiona el pedido, sus datos.
- Ticket: se representan los productos consumidos, el precio de estos y se calcula el valor total.
- Descontable: interfaz en la que se aplican los descuentos a los productos.
- Main: contiene todos los datos principales y donde se ejecuta el programa.

## Funcionamiento

El usuario puede crear un ticket añadiendo los productos que ha consumido.
Cada producto tiene un nombre y un precio.

Al haber añadido los productos, se calcula el importe de estos y si alguno de ellos tiene descuento se le aplicará.

Una vez calculado, se mostrará el ticket en el que se visualizará los productos consumidos con sus precios y el importe total a pagar.

## Requisitos

- Tener instalado Java JDK 17 o superior.
- Tener un entorno de desarrollo como IntelliJ IDEA.
- Tener Git instalado para trabajar con el repositorio.

## Instrucciones de uso
1. Ejecutar el programa desde la clase Main.
2. Introducir los datos que se piden por el programa.
3. Añadir los productos consumidos al ticket.
4. El programa calculará el importe total de los productos puestos y si tiene alguno descuento lo calculará y lo aplicará.
5. Por último, se mostrará el ticket con el precio total y lo que se tendrá que pagar.


## Ejemplo de uso

Un ejemplo de un ticket podría ser:

CAFETERÍA JAVA

Cliente: Ana López

Camarero: Carlos - Código: C01

Productos:
1. Café mediano - 1.80 €
2. Bocadillo caliente - 3.50 €
3. Zumo grande - 2.20 € 
- Descuento aplicado al café: 10%
- Precio final del café: 1.62 €

- Total: 7.50 € 

## Autoría y licencia
Ainhoa Sofía Berrocal Ricaldi

Este proyecto se ha realizado con fines educativos.

