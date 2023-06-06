package com.meituan.android.privacy.impl.config;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f implements com.meituan.android.privacy.interfaces.config.b {
    public static ChangeQuickRedirect a;
    public Map<String, com.meituan.android.privacy.interfaces.config.c> b;
    public Map<String, com.meituan.android.privacy.interfaces.config.c> c;
    public transient boolean d;
    public transient boolean e;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bc666324ee4e59e6a69622ca91dec25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bc666324ee4e59e6a69622ca91dec25");
            return;
        }
        this.b = Collections.emptyMap();
        this.c = Collections.emptyMap();
        this.e = false;
    }

    public f(Map<String, com.meituan.android.privacy.interfaces.config.c> map, Map<String, com.meituan.android.privacy.interfaces.config.c> map2, boolean z) {
        Object[] objArr = {map, map2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5846d03ad5bdbff8e3be8b77b4727bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5846d03ad5bdbff8e3be8b77b4727bd");
            return;
        }
        this.b = Collections.emptyMap();
        this.c = Collections.emptyMap();
        this.e = false;
        this.b = map;
        this.c = map2;
        this.d = z;
    }

    public final com.meituan.android.privacy.interfaces.config.c a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b03fe53947742cd63fce13182a04a2a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.privacy.interfaces.config.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b03fe53947742cd63fce13182a04a2a1");
        }
        com.meituan.android.privacy.interfaces.config.c cVar = this.c.get(str2);
        return cVar != null ? cVar : this.b.get(str);
    }

    @Override // com.meituan.android.privacy.interfaces.config.b
    public final void a(DataOutput dataOutput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataOutput, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e556954965a35eb526bdf71672c8ad85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e556954965a35eb526bdf71672c8ad85");
            return;
        }
        b(dataOutput, byteBuffer, this.b);
        b(dataOutput, byteBuffer, this.c);
    }

    private static void b(DataOutput dataOutput, ByteBuffer byteBuffer, @NonNull Map<String, ? extends com.meituan.android.privacy.interfaces.config.b> map) throws IOException {
        Object[] objArr = {dataOutput, byteBuffer, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a54cf17f1ad05c810b706226cde0d7da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a54cf17f1ad05c810b706226cde0d7da");
            return;
        }
        dataOutput.writeInt(map.size());
        for (Map.Entry<String, ? extends com.meituan.android.privacy.interfaces.config.b> entry : map.entrySet()) {
            com.meituan.android.privacy.interfaces.config.c.a(dataOutput, byteBuffer, entry.getKey());
            entry.getValue().a(dataOutput, byteBuffer);
        }
    }

    private static Map<String, com.meituan.android.privacy.interfaces.config.c> c(DataInput dataInput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataInput, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c0a733c05fd6cf3562994165892d6c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c0a733c05fd6cf3562994165892d6c3");
        }
        int readInt = dataInput.readInt();
        if (readInt <= 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            String a2 = com.meituan.android.privacy.interfaces.config.c.a(dataInput, byteBuffer);
            com.meituan.android.privacy.interfaces.config.c cVar = new com.meituan.android.privacy.interfaces.config.c();
            Object[] objArr2 = {dataInput, byteBuffer};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.privacy.interfaces.config.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "21315572d35c8d7c944c790a8ed5e71a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "21315572d35c8d7c944c790a8ed5e71a");
            } else {
                cVar.b = dataInput.readBoolean();
                cVar.c = dataInput.readBoolean();
                cVar.d = dataInput.readBoolean();
                cVar.e = dataInput.readLong();
                cVar.f = dataInput.readBoolean();
                cVar.g = dataInput.readBoolean();
                cVar.h = dataInput.readBoolean() ? "AUTO_TRIGGER" : "USER_TRIGGER";
                cVar.i = dataInput.readBoolean();
                cVar.j = dataInput.readBoolean();
                cVar.k = dataInput.readInt();
                cVar.l = dataInput.readBoolean();
            }
            hashMap.put(a2, cVar);
        }
        return hashMap;
    }

    public static void a(DataOutput dataOutput, ByteBuffer byteBuffer, @NonNull Map<String, ? extends com.meituan.android.privacy.interfaces.config.b> map) throws IOException {
        Object[] objArr = {dataOutput, byteBuffer, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f2fd79cf66e5f0393cdb7c9cf4bf2df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f2fd79cf66e5f0393cdb7c9cf4bf2df");
            return;
        }
        dataOutput.writeInt(map.size());
        for (Map.Entry<String, ? extends com.meituan.android.privacy.interfaces.config.b> entry : map.entrySet()) {
            com.meituan.android.privacy.interfaces.config.c.a(dataOutput, byteBuffer, entry.getKey());
            entry.getValue().a(dataOutput, byteBuffer);
        }
    }

    public static Map<String, com.meituan.android.privacy.interfaces.config.a> a(DataInput dataInput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataInput, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a0b8ef3f321ef8f9f1a9107b4d07328", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a0b8ef3f321ef8f9f1a9107b4d07328");
        }
        int readInt = dataInput.readInt();
        if (readInt <= 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            String a2 = com.meituan.android.privacy.interfaces.config.c.a(dataInput, byteBuffer);
            com.meituan.android.privacy.interfaces.config.a aVar = new com.meituan.android.privacy.interfaces.config.a();
            aVar.a(dataInput, byteBuffer);
            hashMap.put(a2, aVar);
        }
        return hashMap;
    }

    public final void b(DataInput dataInput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataInput, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dedcf5f3155cc41f771b9bbd884bb94c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dedcf5f3155cc41f771b9bbd884bb94c");
            return;
        }
        this.b = c(dataInput, byteBuffer);
        this.c = c(dataInput, byteBuffer);
    }

    public final void a(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8ea172bb5accfe9864e8bfd0f8881e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8ea172bb5accfe9864e8bfd0f8881e3");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.b.keySet()) {
            jSONObject2.put(str, this.b.get(str).toString());
        }
        jSONObject.put("permission", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        for (String str2 : this.c.keySet()) {
            jSONObject3.put(str2, this.c.get(str2).toString());
        }
        jSONObject.put("api", jSONObject3);
    }
}
