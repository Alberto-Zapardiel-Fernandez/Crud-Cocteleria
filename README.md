# Crud-Cocteleria

<h2>La aplicación consta de un CRUD y una API REST de Cócteles, conectada a una base de datos para hacer las operaciones.</h2>

<h2>Tenemos varios paquetes</h2>

<ol>
  <li><h3>Controller</h3>  Es el encargado de gestionar las rutas y endpoints hacia donde lanzar nuestras consultas
  #Pueden ser:
    <ul>
      <li>GET: Para obtener los datos requeridos</li>
      <li>POST: Para almacenar los cócteles nuevos a insertar</li>
      <li>PUT: Para actualizar el cóctel que queramos </li>
      <li>DELETE: Para borrar el cóctel según el ID que le pasemos por parámetro</li>
    </ul>
  </li>  
  <br>
  <li><h3>DAO</h3>  Es la capa que gestiona la conexión con el JPARepository, al que le decimos del tipo que será.</li>
  <br>
  <li><h3>Model</h3>  Es el POJO en este caso de Coctel, el cual tiene, sus constructores,getters y setters y las siguientes variables:
    <ul>
      <li>ID. Identificador único para cada cóctel</li>
      <li>Nombre. El nombre del cóctel</li>
      <li>Creador. La persona que ha diseñado el cóctel</li>
      <li>Ingredientes. Será una lista de ingredientes para la composición del cóctel (Aún por implementar). Actualmente se trata como una cadena de texto</li>
    </ul>
  </li>
  <li><h3>Inicio</h3>  Clase main encargada del arranque de la aplicación a través de Spring</li>
  <br>
  <li><h3>Service</h3>  En este paquete tendremos 2 clases
    <ul>
      <li>CoctelService - Es la interfaz encargada de definir los métodos que vamos a implementar</li>
      <li>CoctelServiceImpl - Es la clase que gestiona, gracias a la capa DAO, la conexión con los métodos que tiene Spring a través del JPARepository
        para guardar los datos y realizar los métodos de la interfaz antes comentada.</li>
    </ul>
  </li>
</ol>
