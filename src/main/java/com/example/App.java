package com.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import com.example.fParser.ProgramContext;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     */

        public static void main(String[] args) throws IOException {
            //charstream from hello.txt
            //read hello.txt
            CharStream input = CharStreams.fromFileName("E:/Letoltes/CODING_synced/CODING/_CODE proj/myLang/BEAU/language/demo/src/main/java/com/example/t.txt");
         

            fLexer lexer = new fLexer(input);
    
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            fParser parser = new fParser(tokens);
    
            ProgramContext tree = parser.program();
    
            ParseTreeWalker walker = new ParseTreeWalker();
            fBaseListener listener = new fBaseListener();
            walker.walk(listener, tree);
    
            String javaCode = listener.getJavaCode();

            System.out.println("Generated Java code: " + javaCode);
    
            compileAndExecuteJavaCode(javaCode);
        }
    

    private static void compileAndExecuteJavaCode(String javaCode) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        OutputStream out = new ByteArrayOutputStream();
        OutputStream err = new ByteArrayOutputStream();
        int result = compiler.run(null, out, err, "Main.java");
        System.out.println("Compilation result: " + result);
        System.out.println("Compilation output: " + out.toString());
        System.out.println("Compilation errors: " + err.toString());
    
        if (result == 0) {
            try {
                Class.forName("Main").getDeclaredMethod("main", String[].class).invoke(null, (Object) new String[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    
    // class JavaCodeGeneratorListener extends fBaseListener {
    //     private StringBuilder builder = new StringBuilder();
    
    //     @Override
    //     public void exitVarDecl(fParser.VarDeclContext ctx) {
    //         String type = ctx.TYPE().getText();
    //         String name = ctx.ID().getText();
    //         String value = ctx.expr().getText();
    
    //         builder.append(String.format("%s %s = %s;\n", type, name, value));
    //     }
    
    //     public String getJavaCode() {
    //         return builder.toString();
    //     }
    // }   
}
