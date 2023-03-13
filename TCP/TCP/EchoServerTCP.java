package server;



import java.io.*;
import java.net.*;
import java.util.Scanner;

class EchoServerTCP {
    
    public static void main(String[] args) throws IOException 
    {
        ServerSocket server = null;
        Socket client = null;
        //BufferedReader in = null;
        PrintWriter out = null;
        Scanner in = null;
        String line;
        int port = 12345; //puerto del servidor
        
      /*
       * Crear e inicializar el socket del servidor
       */
        try
        {
          //Aqui  
        }
        catch (IOException e) 
        {
            System.out.println("Could not listen on port "+port);                  
            System.exit(-1);
        }
        
        while (true) //funcion del servidor:
        {
            try
            {
                //Esperar conexiones entrantes
                
                
                
                //Mostrar infomación del socket conectado
            }
            catch(IOException e) 
            {
                System.out.println("Accept failed: "+ port); 
                System.exit(-1); 
            }
            
            try
            {

		//Una vez aceptada una conexión, inicializar flujos de entrada/salida del socket conectado
                
                
            } 
            catch (IOException e) 
            {
                System.out.println("IO exception "); 
                System.exit(-1);
            }       

            boolean salir = false;
            
            while(!salir)
            {
                try
                {
                   //Leer datos del cliente en String line
                    System.out.println("Received from client " + line);
        
              //Comprueba si es fin de conexión
                    if (line.compareTo("CLOSE") != 0)
             
                    {
                    	
                        //Envia eco al cliente


                        
                        System.out.println("Sending to client " + line);
                    } //Send data back to client
                    else //El cliente quiere cerrar conexión, ha enviado CLOSE    
                    {
                        //Envia OK al cliente
                        


                        salir = true;
                    }
                } 
                catch (Exception e) 
                {
                    System.out.println("Read failed"); 
                    System.exit(-1); 
                }
            } //fin del servicio
     
            System.out.println("Closing connection with the client");
            //Cierra flujos y socket de la conexión con el cliente
            System.out.println("Waiting for a new client");
        } //fin del bucle
        //server.close(); 
    } 
}//fin del metodo y la clase

