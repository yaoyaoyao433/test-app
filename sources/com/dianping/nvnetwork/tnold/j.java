package com.dianping.nvnetwork.tnold;

import android.annotation.SuppressLint;
import com.dianping.nvnetwork.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    public static ChangeQuickRedirect a;
    @SuppressLint({"UseSparseArrays"})
    final Map<Integer, a> b;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf9a9fffbc55ec1990773f82bca211c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf9a9fffbc55ec1990773f82bca211c0");
        } else {
            this.b = new HashMap();
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec90eaaa940a97fc32a95dab203a6140", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec90eaaa940a97fc32a95dab203a6140");
            return;
        }
        a aVar = this.b.get(Integer.valueOf(i));
        if (aVar == null) {
            return;
        }
        aVar.b.clear();
        if (aVar.a()) {
            this.b.remove(Integer.valueOf(i));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        final List<i> b;
        private boolean c;
        private final ByteBuffer d;
        private boolean e;
        private ByteBuffer f;
        private i g;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "355caa64060d0b745db5e5eb66942d69", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "355caa64060d0b745db5e5eb66942d69");
                return;
            }
            this.b = new LinkedList();
            this.d = ByteBuffer.allocate(8);
        }

        public final boolean a() {
            return (this.c || this.e) ? false : true;
        }

        public final void a(com.dianping.nvtunnelkit.kit.q qVar) throws Exception {
            ByteBuffer allocate;
            Object[] objArr = {qVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0654d6acb360ece81547a9ff6e28b2f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0654d6acb360ece81547a9ff6e28b2f");
                return;
            }
            ByteBuffer byteBuffer = qVar.b;
            if (byteBuffer.hasRemaining()) {
                boolean z = false;
                do {
                    if (!this.c && !this.e) {
                        int i = byteBuffer.get() & 255;
                        if (i == 0) {
                            com.dianping.nvtunnelkit.logger.b.a("tl-luoheng", "PING KPHG ####->:");
                            this.g = new i(0);
                            z = true;
                        } else if (i == 255) {
                            this.c = true;
                            this.g = new i(1, qVar.c, 0L);
                            this.d.clear();
                        } else {
                            z.a("Unexpected tn package flag" + i, 0);
                        }
                    }
                    if (this.c) {
                        com.dianping.nvtunnelkit.utils.b.a(byteBuffer, this.d);
                        if (!this.d.hasRemaining()) {
                            this.d.flip();
                            this.c = false;
                            i iVar = this.g;
                            ByteBuffer byteBuffer2 = this.d;
                            Object[] objArr2 = {byteBuffer2};
                            ChangeQuickRedirect changeQuickRedirect2 = i.a;
                            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "6032d427aa63ed523ed11fe6d673d8ca", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "6032d427aa63ed523ed11fe6d673d8ca");
                            } else {
                                iVar.c.version = byteBuffer2.get() & 255;
                                iVar.c.deviceType = byteBuffer2.get() & 255;
                                iVar.c.flag = 255 & byteBuffer2.get();
                                iVar.c.isSecure = (byteBuffer2.get() & 1) == 1;
                            }
                            int i2 = this.d.getInt();
                            if (i2 > 0) {
                                this.e = true;
                                Object[] objArr3 = {Integer.valueOf(i2), 5242880};
                                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.nvtunnelkit.utils.b.a;
                                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2ce472ab47a7dce72ee88bc9b34f3419", RobustBitConfig.DEFAULT_VALUE)) {
                                    allocate = (ByteBuffer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2ce472ab47a7dce72ee88bc9b34f3419");
                                } else if (i2 > 5242880) {
                                    throw new com.dianping.nvtunnelkit.exception.b("expected buffer size > 5242880", i2);
                                } else {
                                    allocate = ByteBuffer.allocate(i2);
                                }
                                this.f = allocate;
                            } else {
                                z = true;
                            }
                        }
                    }
                    if (this.e) {
                        com.dianping.nvtunnelkit.utils.b.a(byteBuffer, this.f);
                        if (!this.f.hasRemaining()) {
                            this.f.flip();
                            this.e = false;
                            i iVar2 = this.g;
                            ByteBuffer byteBuffer3 = this.f;
                            Object[] objArr4 = {byteBuffer3};
                            ChangeQuickRedirect changeQuickRedirect4 = i.a;
                            if (PatchProxy.isSupport(objArr4, iVar2, changeQuickRedirect4, false, "7d7eb74eb477b60565557fe84b93e4dd", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, iVar2, changeQuickRedirect4, false, "7d7eb74eb477b60565557fe84b93e4dd");
                            } else {
                                iVar2.d = byteBuffer3 != null ? byteBuffer3.capacity() : 0;
                                if (iVar2.d > 0) {
                                    int i3 = byteBuffer3.getShort();
                                    if (i3 > 0) {
                                        byte[] bArr = new byte[i3];
                                        byteBuffer3.get(bArr, 0, i3);
                                        iVar2.c.noSecureLength = i3;
                                        iVar2.c.payload = new String(bArr);
                                        try {
                                            JSONObject jSONObject = new JSONObject(iVar2.c.payload);
                                            if (jSONObject.has("z")) {
                                                iVar2.c.zip = jSONObject.getInt("z");
                                            }
                                        } catch (JSONException e) {
                                            com.dianping.nvtunnelkit.logger.b.a(e);
                                        }
                                    }
                                    int i4 = (iVar2.d - i3) - 2;
                                    if (i4 > 0) {
                                        byte[] bArr2 = new byte[i4];
                                        byteBuffer3.get(bArr2, 0, i4);
                                        iVar2.c.array = bArr2;
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    if (z) {
                        this.b.add(this.g);
                        z = false;
                    }
                } while (byteBuffer.hasRemaining());
            }
        }
    }
}
