package com.dianping.nvnetwork.tunnel.Encrypt;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class SecureProtocolData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public byte[] array;
    public int deviceType;
    public int encryptFlag;
    public int flag;
    public String id;
    public boolean isSecure;
    public boolean macFlag;
    public int noSecureLength;
    public OutputStream out;
    public String payload;
    public byte[] securePayload;
    public byte[] source;
    public int totalLength;
    public int version;
    public int zip;

    public SecureProtocolData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba6ad91c7796b2a76752e4d94235ce2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba6ad91c7796b2a76752e4d94235ce2d");
            return;
        }
        this.flag = -1;
        this.encryptFlag = -1;
        this.zip = -1;
    }

    public void close() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11f9e30c2fc58109d47d52814454b627", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11f9e30c2fc58109d47d52814454b627");
        } else if (this.out != null) {
            try {
                this.out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c09f6b5cb18126fde92e92fd407ccfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c09f6b5cb18126fde92e92fd407ccfc");
            return;
        }
        this.out = new ByteArrayOutputStream();
        this.flag = -1;
        this.isSecure = false;
    }
}
