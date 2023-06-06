package com.meituan.robust.assistant.process;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FileUtils {
    public static String readFile(File file) {
        BufferedReader bufferedReader;
        if (!file.exists()) {
            return "";
        }
        BufferedReader bufferedReader2 = null;
        try {
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                } catch (Exception unused) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    bufferedReader2 = bufferedReader;
                    th = th;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
            String sb2 = sb.toString();
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            return sb2;
        } catch (Exception unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void writeFile(File file, String str) {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileWriter.write(str);
            try {
                fileWriter.close();
            } catch (IOException unused2) {
            }
        } catch (IOException unused3) {
            fileWriter2 = fileWriter;
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (IOException unused4) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }
}
