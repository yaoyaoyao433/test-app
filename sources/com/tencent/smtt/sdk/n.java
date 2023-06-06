package com.tencent.smtt.sdk;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/* loaded from: classes6.dex */
public class n {
    private static n a;
    private static Context b;

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n a(Context context) {
        if (a == null) {
            synchronized (n.class) {
                if (a == null) {
                    a = new n();
                }
            }
        }
        b = context.getApplicationContext();
        return a;
    }

    private Properties e() {
        Properties properties;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                File a2 = a();
                properties = new Properties();
                if (a2 != null) {
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(a2));
                    } catch (Exception e) {
                        e = e;
                    }
                    try {
                        properties.load(bufferedInputStream);
                        bufferedInputStream2 = bufferedInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        bufferedInputStream2 = bufferedInputStream;
                        e.printStackTrace();
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        return properties;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream2 = bufferedInputStream;
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return properties;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            e = e6;
            properties = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File a() {
        p.a();
        File file = new File(p.t(b), "tbscoreinstall.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        a("dexopt_retry_num", i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        a("copy_core_ver", i);
        a("copy_status", i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        a("install_apk_path", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, int i) {
        a(str, String.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                Properties e = e();
                if (e != null) {
                    e.setProperty(str, str2);
                    File a2 = a();
                    if (a2 != null) {
                        fileOutputStream = new FileOutputStream(a2);
                        try {
                            e.store(fileOutputStream, "update " + str + " and status!");
                            fileOutputStream2 = fileOutputStream;
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream2 = fileOutputStream;
                            e.printStackTrace();
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                    return;
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return c("install_core_ver");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(String str) {
        Properties e = e();
        if (e == null || e.getProperty(str) == null) {
            return -1;
        }
        return Integer.parseInt(e.getProperty(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        a("unzip_retry_num", i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i, int i2) {
        a("tpatch_ver", i);
        a("tpatch_status", i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return b("install_status");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(String str) {
        Properties e = e();
        if (e == null || e.getProperty(str) == null) {
            return 0;
        }
        return Integer.parseInt(e.getProperty(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i) {
        a("incrupdate_status", i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i, int i2) {
        a("install_core_ver", i);
        a("install_status", i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return b("incrupdate_status");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d(String str) {
        Properties e = e();
        if (e == null || e.getProperty(str) == null) {
            return null;
        }
        return e.getProperty(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i) {
        a("unlzma_status", i);
    }
}
