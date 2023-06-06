package com.meituan.msc.jse.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCWritableMap extends MSCReadableMap implements WritableMap {
    public static ChangeQuickRedirect changeQuickRedirect;

    public MSCWritableMap() {
    }

    public MSCWritableMap(JSONObject jSONObject) {
        super(jSONObject);
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "181a837fae5190925c77f8e294b317ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "181a837fae5190925c77f8e294b317ef");
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putNull(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c44eff6e496161ce35c6f5a50fbc868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c44eff6e496161ce35c6f5a50fbc868");
            return;
        }
        try {
            this.object.put(str, (Object) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putBoolean(@NonNull String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b71b18e0a50cad63d79decf0b668f5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b71b18e0a50cad63d79decf0b668f5d");
            return;
        }
        try {
            this.object.put(str, z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putDouble(@NonNull String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db93c8d2f9c831e9c13045eceed4bd48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db93c8d2f9c831e9c13045eceed4bd48");
            return;
        }
        try {
            this.object.put(str, d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putInt(@NonNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e92625ac79c7ac989420dfb94ffec363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e92625ac79c7ac989420dfb94ffec363");
            return;
        }
        try {
            this.object.put(str, i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putString(@NonNull String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3bfdf6f8950d0c510b2654dd0d2e8d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3bfdf6f8950d0c510b2654dd0d2e8d6");
            return;
        }
        try {
            this.object.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putArray(@NonNull String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {str, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f3ed70ded92593d9c2b935c69bec171", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f3ed70ded92593d9c2b935c69bec171");
        } else if (!(readableArray instanceof MSCReadableArray)) {
            throw new RuntimeException("value must be MSCReadableArray");
        } else {
            try {
                this.object.put(str, ((MSCReadableArray) readableArray).getRealData());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putMap(@NonNull String str, @Nullable ReadableMap readableMap) {
        Object[] objArr = {str, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc0bfdbce1cc3a07cea39beceb06a23a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc0bfdbce1cc3a07cea39beceb06a23a");
        } else if (!(readableMap instanceof MSCReadableMap)) {
            throw new RuntimeException("value must be MSCReadableMap");
        } else {
            try {
                this.object.put(str, ((MSCReadableMap) readableMap).getRealData());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void merge(@NonNull ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78556f87f04989ae5563ea9f7ec64d52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78556f87f04989ae5563ea9f7ec64d52");
        } else if (!(readableMap instanceof MSCReadableMap)) {
            throw new RuntimeException("value must be MSCReadableMap");
        } else {
            JSONObject jSONObject = ((MSCReadableMap) readableMap).object;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    this.object.put(next, jSONObject.opt(next));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public MSCWritableMap copy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0855b249c02790a302a3a0dfde42daad", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCWritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0855b249c02790a302a3a0dfde42daad");
        }
        MSCWritableMap mSCWritableMap = new MSCWritableMap();
        mSCWritableMap.merge(this);
        return mSCWritableMap;
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putArray(@NonNull String str, @Nullable WritableArray writableArray) {
        Object[] objArr = {str, writableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cec1f71fe1fc7d47150b3e9894ca997a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cec1f71fe1fc7d47150b3e9894ca997a");
        } else {
            putArray(str, (MSCReadableArray) writableArray);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putMap(@NonNull String str, @Nullable WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "558e92a67dc48cae8c4258c3a01309b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "558e92a67dc48cae8c4258c3a01309b4");
        } else {
            putMap(str, (MSCReadableMap) writableMap);
        }
    }

    @Override // com.meituan.msc.jse.bridge.MSCReadableMap
    public JSONObject getRealData() {
        return this.object;
    }
}
