package com.dianping.nvnetwork.tunnel.protocol;

import com.dianping.nvnetwork.tunnel.Encrypt.SecureProtocolData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final byte[] b = new byte[4096];

    public final SecureProtocolData a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "959679b46ef90fe8a7994af6fbef81bc", 6917529027641081856L)) {
            return (SecureProtocolData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "959679b46ef90fe8a7994af6fbef81bc");
        }
        SecureProtocolData secureProtocolData = new SecureProtocolData();
        secureProtocolData.init();
        int i = 0;
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                return secureProtocolData;
            }
            if (read != 0 || i != 0) {
                if (i == 0 && read != 255) {
                    break;
                }
                if (i == 1) {
                    secureProtocolData.version = read;
                }
                if (secureProtocolData.version == 1 && i != 2) {
                    if (i == 3) {
                        secureProtocolData.flag = read;
                    } else if (i == 4) {
                        if (read == 1) {
                            secureProtocolData.isSecure = true;
                        }
                        int read2 = ((((inputStream.read() << 24) | ((inputStream.read() & 255) << 16)) | ((inputStream.read() & 255) << 8)) | (inputStream.read() & 255)) - 2;
                        secureProtocolData.totalLength = read2;
                        if (read2 <= 4194304) {
                            int read3 = ((inputStream.read() & 255) << 8) | (inputStream.read() & 255);
                            if (read3 <= 65535) {
                                secureProtocolData.noSecureLength = read3;
                                int i2 = 0;
                                while (i2 < read2) {
                                    int read4 = inputStream.read(b, 0, Math.min(read2 - i2, b.length));
                                    if (read4 >= 0) {
                                        secureProtocolData.out.write(b, 0, read4);
                                        i2 += read4;
                                    } else if (read4 == -1) {
                                    }
                                }
                                secureProtocolData.array = ((ByteArrayOutputStream) secureProtocolData.out).toByteArray();
                                if (secureProtocolData.noSecureLength > 0) {
                                    secureProtocolData.payload = new String(secureProtocolData.array, 0, secureProtocolData.noSecureLength);
                                    try {
                                        JSONObject jSONObject = new JSONObject(secureProtocolData.payload);
                                        if (jSONObject.has("z")) {
                                            secureProtocolData.zip = jSONObject.getInt("z");
                                        }
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }
                                if (secureProtocolData.totalLength - secureProtocolData.noSecureLength > 0) {
                                    byte[] bArr = new byte[secureProtocolData.totalLength - secureProtocolData.noSecureLength];
                                    System.arraycopy(secureProtocolData.array, secureProtocolData.noSecureLength, bArr, 0, secureProtocolData.totalLength - secureProtocolData.noSecureLength);
                                    secureProtocolData.array = bArr;
                                }
                                secureProtocolData.close();
                                return secureProtocolData;
                            }
                            throw new IOException("Json > 65535");
                        }
                        throw new IOException("buffer > 4m");
                    }
                }
                if (i > 5) {
                    throw new IOException("Data Error");
                }
                i++;
            } else {
                secureProtocolData.flag = 0;
                break;
            }
        }
        secureProtocolData.flag = -1;
        secureProtocolData.close();
        return secureProtocolData;
    }
}
