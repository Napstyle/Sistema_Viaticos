/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_viaticos;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author Napstyle
 */
public class GenerarPDF {
   
    private Font fuentetitulo = new Font(Font.FontFamily.TIMES_ROMAN,20,Font.BOLD);
    private Font fuentetexto = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.NORMAL);
    private Font fuentecontenido = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD);
    
    public void generarPDF( 
      String ruta,
     String encabezado,
     String pie,
     String fol,
     String fecha,
     String comisionado, 
     String lugar,
     String motivo,
     String pernoctado,
     String fechas, 
     String actividad,
    String auto
   ){
        
        try{

Document document = new Document();
PdfWriter.getInstance(document,new FileOutputStream(ruta));
document.open();
Image imagen = Image.getInstance("ieen.jpg");
imagen.scaleAbsolute(150,100);
imagen.setAlignment(Element.ALIGN_CENTER);
document.add(imagen);
document.add(getfol(fol));
document.add(getfecha(fecha));
document.add(getencabezado(encabezado));
document.add(getcomisionado(comisionado));
document.add(getlugar(lugar));
document.add(getmotivo(motivo));
document.add(getpernoctado(pernoctado));
document.add(getfechas(fechas));
document.add(getactividad(actividad));

document.add(getlugar(auto));
document.add(getpie(pie));
document.close();
            
            
        }catch(Exception i){
        
        }
    
    
    }
    
    
      private Paragraph getpie(String texto){
    Paragraph p=new Paragraph();
    Chunk c=new Chunk();
    p.setAlignment(Element.ALIGN_CENTER);
    c.append(texto);
    c.setFont(fuentetexto);
    p.add(c);
    return p;
    }
        private Paragraph getfol(String texto){
    Paragraph p=new Paragraph();
    Chunk c=new Chunk();
    p.setAlignment(Element.ALIGN_RIGHT);
    c.append(texto);
    c.setFont(fuentetexto);
    p.add(c);
    return p;
    }
          private Paragraph getfecha(String texto){
    Paragraph p=new Paragraph();
    Chunk c=new Chunk();
    p.setAlignment(Element.ALIGN_RIGHT);
    c.append(texto);
    c.setFont(fuentetexto);
    p.add(c);
    return p;
    }
            private Paragraph getencabezado(String texto){
    Paragraph p=new Paragraph();
    Chunk c=new Chunk();
    p.setAlignment(Element.ALIGN_CENTER);
    c.append(texto);
    c.setFont(fuentetitulo);
    p.add(c);
    return p;
    }
              private Paragraph getcomisionado(String texto){
    Paragraph p=new Paragraph();
    Chunk c=new Chunk();
    p.setAlignment(Element.ALIGN_LEFT);
    c.append(texto);
    c.setFont(fuentetexto);
    p.add(c);
    return p;
    }
                private Paragraph getlugar(String texto){
    Paragraph p=new Paragraph();
    Chunk c=new Chunk();
    p.setAlignment(Element.ALIGN_LEFT);
    c.append(texto);
    c.setFont(fuentetexto);
    p.add(c);
    return p;
    }
                  private Paragraph getmotivo(String texto){
    Paragraph p=new Paragraph();
    Chunk c=new Chunk();
    p.setAlignment(Element.ALIGN_LEFT);
    c.append(texto);
    c.setFont(fuentetexto);
    p.add(c);
    return p;
    }
                    private Paragraph getpernoctado(String texto){
    Paragraph p=new Paragraph();
    Chunk c=new Chunk();
    p.setAlignment(Element.ALIGN_LEFT);
    c.append(texto);
    c.setFont(fuentetexto);
    p.add(c);
    return p;
    }
                      private Paragraph getfechas(String texto){
    Paragraph p=new Paragraph();
    Chunk c=new Chunk();
    p.setAlignment(Element.ALIGN_LEFT);
    c.append(texto);
    c.setFont(fuentetexto);
    p.add(c);
    return p;
    }
                        private Paragraph getactividad(String texto){
    Paragraph p=new Paragraph();
    Chunk c=new Chunk();
    p.setAlignment(Element.ALIGN_LEFT);
    c.append(texto);
    c.setFont(fuentetexto);
    p.add(c);
    return p;
    }
    
    
}
