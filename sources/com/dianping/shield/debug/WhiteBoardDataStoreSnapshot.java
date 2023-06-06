package com.dianping.shield.debug;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.RequiresApi;
import com.dianping.agentsdk.framework.ar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class WhiteBoardDataStoreSnapshot {
    public static int ADD_OPERATION = 2;
    public static int DELETE_OPERATION = 0;
    public static int MODIFIED_OPERATION = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile WhiteBoardDataStoreSnapshot instance;
    private HashMap<String, Object> allDataTempo;
    private HashMap<String, Integer> operationTempo;
    private ar whiteBoard;

    public WhiteBoardDataStoreSnapshot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f459877f716a8ddb7508cd789a5a6ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f459877f716a8ddb7508cd789a5a6ee");
            return;
        }
        this.allDataTempo = new HashMap<>();
        this.operationTempo = new HashMap<>();
    }

    public static WhiteBoardDataStoreSnapshot getSingleton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "89bba0ea1d32fe62622212521aa727ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (WhiteBoardDataStoreSnapshot) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "89bba0ea1d32fe62622212521aa727ff");
        }
        if (instance == null) {
            synchronized (WhiteBoardDataStoreSnapshot.class) {
                if (instance == null) {
                    instance = new WhiteBoardDataStoreSnapshot();
                }
            }
        }
        return instance;
    }

    public void setWhiteBoard(ar arVar) {
        this.whiteBoard = arVar;
    }

    public void releaseWhiteBoard() {
        this.whiteBoard = null;
    }

    @RequiresApi(api = 26)
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b57b35efc8ccc756653aeaa0dc3dc0ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b57b35efc8ccc756653aeaa0dc3dc0ce");
            return;
        }
        onDestroy();
        if (this.whiteBoard == null || this.whiteBoard.b() == null) {
            return;
        }
        setAllDataTempo(this.whiteBoard.b().b());
    }

    public void onSynchronize(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2b65a696027c58e8d0c3835e9ad0f53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2b65a696027c58e8d0c3835e9ad0f53");
        } else if (this.whiteBoard == null || this.whiteBoard.b() == null) {
        } else {
            synchroFromSnapshot(context, this.whiteBoard.b().b());
        }
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21c0f2c267596f09edf21c3be8899746", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21c0f2c267596f09edf21c3be8899746");
            return;
        }
        this.operationTempo.clear();
        this.allDataTempo.clear();
    }

    public HashMap<String, Object> getAllDataTempo() {
        return this.allDataTempo;
    }

    public HashMap<String, Integer> getOperationTempo() {
        return this.operationTempo;
    }

    @RequiresApi(api = 26)
    private void setAllDataTempo(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efac81de73c61dd080df0427c86b00ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efac81de73c61dd080df0427c86b00ca");
            return;
        }
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            this.allDataTempo.put(entry.getKey(), deepCopyValue(entry.getValue()));
        }
    }

    @RequiresApi(api = 26)
    private Object deepCopyValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03bb63461400ff05e1acd6d21de2aa64", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03bb63461400ff05e1acd6d21de2aa64");
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Bundle) {
            return ((Bundle) obj).deepCopy();
        }
        if (obj instanceof ArrayList) {
            return deepcopyArrayList((ArrayList) obj);
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof int[]) {
                return ((int[]) obj).clone();
            }
            if (obj instanceof boolean[]) {
                return ((boolean[]) obj).clone();
            }
            if (obj instanceof long[]) {
                return ((long[]) obj).clone();
            }
            if (obj instanceof float[]) {
                return ((float[]) obj).clone();
            }
            if (obj instanceof double[]) {
                return ((double[]) obj).clone();
            }
            if (obj instanceof byte[]) {
                return ((byte[]) obj).clone();
            }
            if (obj instanceof short[]) {
                return ((short[]) obj).clone();
            }
            if (obj instanceof char[]) {
                return ((char[]) obj).clone();
            }
            if (obj instanceof CharSequence[]) {
                return ((CharSequence[]) obj).clone();
            }
            if (obj instanceof Parcelable[]) {
                return ((Parcelable[]) obj).clone();
            }
            if (obj instanceof Object[]) {
                return ((Object[]) obj).clone();
            }
        }
        return obj;
    }

    @RequiresApi(api = 26)
    private ArrayList deepcopyArrayList(ArrayList arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a42af174106f812a572528bd4e4b4fdf", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a42af174106f812a572528bd4e4b4fdf");
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(deepCopyValue(arrayList.get(i)));
        }
        return arrayList2;
    }

    private void synchroFromSnapshot(Context context, HashMap<String, Object> hashMap) {
        Object[] objArr = {context, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35c0b794d78a154f07d8a9c77b125cce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35c0b794d78a154f07d8a9c77b125cce");
            return;
        }
        for (Map.Entry<String, Integer> entry : this.operationTempo.entrySet()) {
            String key = entry.getKey();
            int intValue = entry.getValue().intValue();
            if (intValue == ADD_OPERATION) {
                hashMap.put(key, this.allDataTempo.get(key));
            } else if (intValue == DELETE_OPERATION) {
                hashMap.remove(key);
            } else if (intValue == MODIFIED_OPERATION) {
                hashMap.put(key, this.allDataTempo.get(key));
            }
        }
        onDestroy();
    }
}
