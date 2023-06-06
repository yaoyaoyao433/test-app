package com.tencent.map.geolocation.a.b;

import com.dianping.titans.service.FileUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i {
    private String a = "WriterAndReaderUtils";
    private File b;

    public i(String str) {
        this.b = null;
        this.b = new File(str);
    }

    public final boolean a(byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            if (!this.b.exists()) {
                File file = new File(this.b.getParent());
                if (!file.exists()) {
                    file.mkdirs();
                    this.b.createNewFile();
                }
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(this.b, false);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            } catch (Exception unused2) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = null;
        try {
            try {
                if (!this.b.exists()) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused) {
                    }
                    return str;
                }
                FileInputStream fileInputStream2 = new FileInputStream(this.b.getAbsolutePath());
                try {
                    byte[] bArr = new byte[FileUtil.DEFAULT_STREAM_BUFFER_SIZE];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.close();
                    String str2 = new String(byteArrayOutputStream.toByteArray());
                    fileInputStream2.close();
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused2) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused3) {
                    }
                    return str2;
                } catch (Exception unused4) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused6) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused7) {
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused8) {
                        }
                        return str;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused9) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused10) {
                    }
                    throw th;
                }
            } catch (Exception unused11) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
