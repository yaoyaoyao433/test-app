package com.sankuai.model.rpc;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.NoProguard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@NoProguard
/* loaded from: classes4.dex */
public class RpcBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String method;
    private Map<String, Object> params;
    @SerializedName("v")
    private int version;

    public RpcBuilder(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e73fb6a70732607cbd24bee5f314a5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e73fb6a70732607cbd24bee5f314a5a");
            return;
        }
        this.version = 1;
        this.params = new HashMap();
        this.method = str;
        this.version = i;
    }

    public RpcBuilder(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28cc5fbc9ccb782f0b8d38c4fe025fb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28cc5fbc9ccb782f0b8d38c4fe025fb9");
            return;
        }
        this.version = 1;
        this.params = new HashMap();
        this.method = str;
    }

    public RpcBuilder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cefd45b7b4dd394c382fd8b5330e59a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cefd45b7b4dd394c382fd8b5330e59a");
            return;
        }
        this.version = 1;
        this.params = new HashMap();
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public Map<String, Object> getParams() {
        return this.params;
    }

    public void setParams(Map<String, Object> map) {
        this.params = map;
    }

    public void setParams(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79cc2bd2a2732df8d109d1a408a21a0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79cc2bd2a2732df8d109d1a408a21a0f");
        } else {
            this.params = (Map) new Gson().fromJson(new Gson().toJson(obj), new TypeToken<Map<String, Object>>() { // from class: com.sankuai.model.rpc.RpcBuilder.1
                public static ChangeQuickRedirect changeQuickRedirect;
            }.getType());
        }
    }

    public RpcBuilder addParams(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd80d99aa57988f4d86de163ede8bf90", RobustBitConfig.DEFAULT_VALUE)) {
            return (RpcBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd80d99aa57988f4d86de163ede8bf90");
        }
        this.params.put(str, obj);
        return this;
    }

    public String[] genRpcParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "697173f56cab17d08da6c953b9dd1f35", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "697173f56cab17d08da6c953b9dd1f35");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        return genRpcParams(arrayList);
    }

    public static String[] genRpcParams(List<RpcBuilder> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7400d9dfe995905a62ccc8648b41d7b3", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7400d9dfe995905a62ccc8648b41d7b3") : new String[]{DaBaiDao.JSON_DATA, new Gson().toJson(list)};
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2f403f0b6a13c52a0ae465061c932fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2f403f0b6a13c52a0ae465061c932fa");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        return new Gson().toJson(arrayList);
    }
}
