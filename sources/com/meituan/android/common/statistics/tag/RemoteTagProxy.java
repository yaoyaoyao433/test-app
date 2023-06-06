package com.meituan.android.common.statistics.tag;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.ipc.DataRequest;
import com.meituan.android.common.statistics.ipc.DataResponse;
import com.meituan.android.common.statistics.ipc.RemoteProxyThread;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.statistics.ipc.RequestManager;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RemoteTagProxy implements ITagManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class TagManagerHelper {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static RemoteTagProxy tagManager = new RemoteTagProxy();
    }

    public RemoteTagProxy() {
    }

    public static RemoteTagProxy getInstance() {
        return TagManagerHelper.tagManager;
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean insertPageName(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f792bb57e4125b98784b97b9a74b73e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f792bb57e4125b98784b97b9a74b73e")).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageName", str);
            jSONObject.put("parentPageName", str2);
            jSONObject.put("attachToParent", z);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("OpType", RequestIDMap.OP_TYPE_TAG.OP_TYPE_INSERT_PAGE_NAME);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("insertPageName").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
        RemoteProxyThread.submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.tag.RemoteTagProxy.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "464c2e754056610eb1eb69c6332028a1", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "464c2e754056610eb1eb69c6332028a1");
                } else {
                    RequestManager.getInstance().request(Statistics.getContext(), build);
                }
            }
        });
        return true;
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean updatePageName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c217c5094e2417e2275ef3d2baf4348", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c217c5094e2417e2275ef3d2baf4348")).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageName", str);
            jSONObject.put("oldPageName", str2);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("OpType", RequestIDMap.OP_TYPE_TAG.OP_TYPE_UPDATE_PAGE_NAME);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("updatePageName").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
        RemoteProxyThread.submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.tag.RemoteTagProxy.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b4ce607a755f766723a07f0a7cb72b2d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b4ce607a755f766723a07f0a7cb72b2d");
                } else {
                    RequestManager.getInstance().request(Statistics.getContext(), build);
                }
            }
        });
        return true;
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean writeTag(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b77c04d0ccd818b94582da41ea6bf0fb", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b77c04d0ccd818b94582da41ea6bf0fb")).booleanValue() : writeTag((String) null, str, map);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean writeTag(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f703123e6461964db41c44d849fa8304", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f703123e6461964db41c44d849fa8304")).booleanValue() : writeTag(str, str2, JsonUtil.mapToJSONObject(map));
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean writeTag(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afdec21a31a686c2f0db4f3479f6cd7c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afdec21a31a686c2f0db4f3479f6cd7c")).booleanValue() : writeTag((String) null, str, jSONObject);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean writeTag(String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de46faab5a572c4dc8de62a19d8f0e41", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de46faab5a572c4dc8de62a19d8f0e41")).booleanValue();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("containerId", str);
            jSONObject2.put("key", str2);
            jSONObject2.put("value", jSONObject);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("OpType", RequestIDMap.OP_TYPE_TAG.OP_TYPE_WRITE_TAG);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeTag").parameter(jSONObject2.toString()).options(jSONObject3.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
        RemoteProxyThread.submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.tag.RemoteTagProxy.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "36f6620db7ce5181546be4079901aeac", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "36f6620db7ce5181546be4079901aeac");
                } else {
                    RequestManager.getInstance().request(Statistics.getContext(), build);
                }
            }
        });
        return true;
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean removeTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b23031e6739fc925126829ee718b04a", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b23031e6739fc925126829ee718b04a")).booleanValue() : removeTag(null, str);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public boolean removeTag(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5a218429444eab097b322cdbbb64cbb", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5a218429444eab097b322cdbbb64cbb")).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("containerId", str);
            jSONObject.put("key", str2);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("OpType", RequestIDMap.OP_TYPE_TAG.OP_TYPE_REMOVE_TAG);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("removeTag").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
        RemoteProxyThread.submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.tag.RemoteTagProxy.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "581929be485b3ea2a4e1dc2f9702abdb", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "581929be485b3ea2a4e1dc2f9702abdb");
                } else {
                    RequestManager.getInstance().request(Statistics.getContext(), build);
                }
            }
        });
        return true;
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public Map<String, Object> getTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de69b8efd417339acc89bcf79a4290df", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de69b8efd417339acc89bcf79a4290df") : getTag(null);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public Map<String, Object> getTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a5f6ab017b9e0bfd091c5f1e957d128", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a5f6ab017b9e0bfd091c5f1e957d128") : getTag(null, str);
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public Map<String, Object> getTag(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab103af730acb2cdba5685a6c8cfe280", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab103af730acb2cdba5685a6c8cfe280");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("containerId", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("key", str2);
            }
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("OpType", RequestIDMap.OP_TYPE_TAG.OP_TYPE_GET_TAG);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("getTag").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
        try {
            Future submitOnThread = RemoteProxyThread.submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.tag.RemoteTagProxy.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e7f6a3be802033c11c0b4829dc9d62d4", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e7f6a3be802033c11c0b4829dc9d62d4");
                    }
                    DataResponse request = RequestManager.getInstance().request(Statistics.getContext(), build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            String str3 = submitOnThread != null ? (String) submitOnThread.get(1L, TimeUnit.SECONDS) : "";
            try {
                if (TextUtils.isEmpty(str3)) {
                    return null;
                }
                return JsonUtil.jsonObjectToMap(new JSONObject(str3));
            } catch (JSONException unused3) {
                return null;
            }
        } catch (Throwable unused4) {
            return null;
        }
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2976a51f825aeb8c48604932020f6664", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2976a51f825aeb8c48604932020f6664");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_TAG.OP_TYPE_CLEAR_TAG);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method(KNBConfig.CONFIG_CLEAR_CACHE).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
        RemoteProxyThread.submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.tag.RemoteTagProxy.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "11cb51a7bcad3475083c431cd42e5e90", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "11cb51a7bcad3475083c431cd42e5e90");
                } else {
                    RequestManager.getInstance().request(Statistics.getContext(), build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public void clear(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c2958ade334db0e9eb9003998944695", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c2958ade334db0e9eb9003998944695");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_TAG.OP_TYPE_CLEAR_CONTAINER_TAG);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("containerId", str);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method(KNBConfig.CONFIG_CLEAR_CACHE).parameter(jSONObject2.toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
        RemoteProxyThread.submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.tag.RemoteTagProxy.7
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ef5897f607f91b2dbf2d3f0df797f892", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ef5897f607f91b2dbf2d3f0df797f892");
                } else {
                    RequestManager.getInstance().request(Statistics.getContext(), build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public void clearMmpTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "561f04f6c1efb034d9b519815c3e17fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "561f04f6c1efb034d9b519815c3e17fe");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_TAG.OP_TYPE_CLEAR_TAG_MMPID);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("mmpId", str);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("clearTag").parameter(jSONObject2.toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
        RemoteProxyThread.submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.tag.RemoteTagProxy.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8041ab9ec0ad82a2b8f4e445923a46fb", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8041ab9ec0ad82a2b8f4e445923a46fb");
                } else {
                    RequestManager.getInstance().request(Statistics.getContext(), build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public void clearMmpTag(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e403c13d0fed3a5e85800b5ca2861974", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e403c13d0fed3a5e85800b5ca2861974");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_TAG.OP_TYPE_CLEAR_TAG_MMPID_PAGEID);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("mmpId", str);
            jSONObject2.put("pageId", str2);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("clearTag").parameter(jSONObject2.toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
        RemoteProxyThread.submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.tag.RemoteTagProxy.9
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ac91d74d7dc198aa1273df09ca66a4b3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ac91d74d7dc198aa1273df09ca66a4b3");
                } else {
                    RequestManager.getInstance().request(Statistics.getContext(), build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.tag.ITagManager
    public String getCurrentTagNodePageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "538804cf1b0049a582c6176724fb26a4", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "538804cf1b0049a582c6176724fb26a4");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_TAG.OP_TYPE_GET_CURRENT_PAGE_NAME);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getCurrentTagNodePageName").options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
        try {
            Future submitOnThread = RemoteProxyThread.submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.tag.RemoteTagProxy.10
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "747a660459c4a56a6fe8c718aa6cf710", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "747a660459c4a56a6fe8c718aa6cf710");
                    }
                    DataResponse request = RequestManager.getInstance().request(Statistics.getContext(), build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            return submitOnThread != null ? (String) submitOnThread.get(1L, TimeUnit.SECONDS) : "";
        } catch (Throwable unused2) {
            return "";
        }
    }
}
