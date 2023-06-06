package com.meituan.android.common.horn.msi;

import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.msi.dispather.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornRegistry {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile HornRegistry sInstance;
    @GuardedBy("this")
    private final Map<String, TypeRegisterInfo> mType2RegisterInfo;

    public static HornRegistry getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9fe964fd38276e993db1908275ea9001", 6917529027641081856L)) {
            return (HornRegistry) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9fe964fd38276e993db1908275ea9001");
        }
        if (sInstance == null) {
            synchronized (HornRegistry.class) {
                if (sInstance == null) {
                    sInstance = new HornRegistry();
                }
            }
        }
        return sInstance;
    }

    @VisibleForTesting
    public HornRegistry() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddc5d50ad8aae72b3b9f01d30054f2ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddc5d50ad8aae72b3b9f01d30054f2ec");
        } else {
            this.mType2RegisterInfo = new HashMap();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class TypeRegisterInfo implements HornCallback {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        public String query;
        @GuardedBy("this")
        public WeakHashMap<e, Boolean> sContainers;
        @NonNull
        public String type;

        public TypeRegisterInfo(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14317c1e57d6506650c41f460bd6ce02", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14317c1e57d6506650c41f460bd6ce02");
                return;
            }
            this.sContainers = new WeakHashMap<>();
            this.type = str;
        }

        public void register(@NonNull MsiCustomContext msiCustomContext, @Nullable Map<String, Object> map) {
            Object[] objArr = {msiCustomContext, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26961681a1234c6e213713323d877b17", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26961681a1234c6e213713323d877b17");
                return;
            }
            synchronized (this) {
                this.sContainers.put(msiCustomContext.getEventDispatcher(), Boolean.TRUE);
            }
            Horn.register(this.type, this, map);
        }

        @Override // com.meituan.android.common.horn.HornCallback
        public void onChanged(boolean z, String str) {
            LinkedList linkedList;
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4035f4041ae594c4f203407dbea82e2c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4035f4041ae594c4f203407dbea82e2c");
                return;
            }
            synchronized (this) {
                linkedList = new LinkedList(this.sContainers.keySet());
            }
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a("horn", this.type, jSONObject);
            }
        }
    }

    public void register(@NonNull String str, @NonNull MsiCustomContext msiCustomContext, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, msiCustomContext, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0678b3703d038c91eaaaa8304b66c1ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0678b3703d038c91eaaaa8304b66c1ad");
            return;
        }
        TypeRegisterInfo typeRegisterInfo = this.mType2RegisterInfo.get(str);
        if (typeRegisterInfo == null) {
            synchronized (this) {
                typeRegisterInfo = this.mType2RegisterInfo.get(str);
                if (typeRegisterInfo == null) {
                    typeRegisterInfo = new TypeRegisterInfo(str);
                    this.mType2RegisterInfo.put(str, typeRegisterInfo);
                }
            }
        }
        typeRegisterInfo.register(msiCustomContext, map);
    }
}
