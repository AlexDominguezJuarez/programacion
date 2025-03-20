package TEMA7.EJERCICIOS;

import java.io.*;

public class Diccionario {
    public static void main(String[] args) {

        String rutaCarpeta="C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos";

        int eleccion=1;
        File dir = new File("Diccionario");

        //CREAR LA CARPETA
        if(!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Carpeta creada");
            } else {
                System.out.println("Carpeta no creada");
            }
        }else{
            System.out.println("Carpeta ya creada");
        }


            switch (eleccion){
                case 1:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'A') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\A.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                case 2:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'B') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\B.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 3:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'C') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\C.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                case 4:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'D') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\E.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 5:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'E') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\E.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                case 6:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'F') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\F.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                case 7:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'G') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\F.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 8:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'G') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\G.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                case 9:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'H') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\H.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 10:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'I') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\I.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 11:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'J') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\J.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 12:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'K') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\K.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 13:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'L') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\L.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 14:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'M') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\M.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 15:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'N') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\N.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 16:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'O') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\O.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 17:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'P') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\P.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 18:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'Q') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\Q.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 19:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'R') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\R.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 20:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'S') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\S.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 21:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'T') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\T.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 22:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'U') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\U.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 23:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'V') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\V.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 24:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'W') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\W.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 25:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'X') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\X.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 26:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'Y') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\Y.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                case 27:
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\Documentos2\\Documentos\\diccionario.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.charAt(0) == 'Z') {
                                try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\programacion\\Diccionario\\Z.txt")) {
                                    BufferedWriter bw = new BufferedWriter(file);
                                    bw.write(line);
                                    bw.newLine();
                                    bw.close();

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
            }
    }
}
