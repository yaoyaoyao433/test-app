package com.meituan.android.common.statistics.gesture.data;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.ipc.DataRequest;
import com.meituan.android.common.statistics.ipc.RemoteProxyThread;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.statistics.ipc.RequestManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GestureDataHandlerRemote implements IGestureDataHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class GestureHandlerRemoteHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static GestureDataHandlerRemote gestureDataHandlerRemote = new GestureDataHandlerRemote();
    }

    @Override // com.meituan.android.common.statistics.gesture.data.IGestureDataHandler
    public void clean() {
    }

    @Override // com.meituan.android.common.statistics.gesture.data.IGestureDataHandler
    public List<GestureEntity> getGesture() {
        return null;
    }

    public static GestureDataHandlerRemote getInstance() {
        return GestureHandlerRemoteHolder.gestureDataHandlerRemote;
    }

    @Override // com.meituan.android.common.statistics.gesture.data.IGestureDataHandler
    public void saveGesture(GestureEntity gestureEntity) {
        Object[] objArr = {gestureEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fff00b8caf86fab66956181810935cfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fff00b8caf86fab66956181810935cfc");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gestureEntity", gestureEntity.toJson());
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("OpType", RequestIDMap.OP_TYPE_GESTURE.OP_TYPE_SAVE_GESTURE);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("saveGesture").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
        RemoteProxyThread.submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.gesture.data.GestureDataHandlerRemote.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4a76adec0bb91468795d3979b9a22743", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4a76adec0bb91468795d3979b9a22743");
                } else {
                    RequestManager.getInstance().request(Statistics.getContext(), build);
                }
            }
        });
    }
}
