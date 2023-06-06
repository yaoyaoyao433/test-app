package com.meituan.android.common.statistics.InnerDataBuilder;

import android.content.Context;
import com.meituan.android.common.statistics.cache.ICacheHandler;
import com.meituan.android.common.statistics.utils.SntpUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class InnerDataManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void processDataOnNetworkFinish() {
    }

    public static void processDataOnNetworkStart(boolean z) {
    }

    public static JSONObject processDataOnCreate(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c818e7077b1cf2ae76554cd065a029f8", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c818e7077b1cf2ae76554cd065a029f8");
        }
        try {
            CheckSFromBuilder.getInstance().processData(context, jSONObject, null, SntpUtil.currentTimeMillis());
            MrnInfoBuilder.getInstance().processData(context, jSONObject, null, SntpUtil.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject processDataOnStore(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "78ef4fbb207a67e302a23476369ae3a1", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "78ef4fbb207a67e302a23476369ae3a1");
        }
        try {
            CheckParamValidBuilder.getInstance().processData(context, jSONObject, null, SntpUtil.currentTimeMillis());
            CommonDataBuilder.getInstance().processData(context, jSONObject, null, SntpUtil.currentTimeMillis());
            GlobalSeqCounterBuilder.getInstance().processData(context, jSONObject, null, SntpUtil.currentTimeMillis());
            HighFlowBuilder.getInstance().processData(context, jSONObject, null, SntpUtil.currentTimeMillis());
            return SeqCountBuilder.getInstance().processData(context, jSONObject, null, SntpUtil.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public static List<ICacheHandler.Event> processDataOnReport(Context context, List<ICacheHandler.Event> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4671556cab4b5f66726aaf78d900708b", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4671556cab4b5f66726aaf78d900708b");
        }
        if (list == null || list.size() == 0) {
            return list;
        }
        LinkedList linkedList = new LinkedList();
        try {
            long currentTimeMillis = SntpUtil.currentTimeMillis();
            for (int i = 0; i < list.size(); i++) {
                ICacheHandler.Event event = list.get(i);
                NetworkReportTimeBuilder.getInstance().processData(context, event.getEvs(), event.getEnvironment(), currentTimeMillis);
                linkedList.add(event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return linkedList;
    }
}
