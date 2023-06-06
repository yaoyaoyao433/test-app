package com.meituan.android.legwork.monitor.report.channel.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.legwork.bean.monitor.DaBaiBean;
import com.meituan.android.legwork.bean.monitor.DaBaiMetric;
import com.meituan.android.legwork.monitor.MonitorCallbackManager;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.android.legwork.monitor.report.channel.model.ReportChannel;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.net.subscriber.a;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.legwork.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import rx.d;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ReportChannelDaBai extends ReportChannel {
    private static final int MAX_REPORT_WINDOW = 300;
    private static final String TAG = "ReportChannelDaBai";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ReportChannelDaBai instance = new ReportChannelDaBai();
    private boolean mIsReporting;

    public ReportChannelDaBai() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e60637a733a155e3f7804f9ee26baac7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e60637a733a155e3f7804f9ee26baac7");
        } else {
            this.mIsReporting = false;
        }
    }

    public static ReportChannel getInstance() {
        return instance;
    }

    @Override // com.meituan.android.legwork.monitor.report.channel.model.ReportChannel
    public void reportCachedData(final ReportChannel.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f26e6ee3c313568bf2b68a9cec6a32d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f26e6ee3c313568bf2b68a9cec6a32d9");
        } else if (!this.mIsReporting) {
            this.mIsReporting = true;
            DaBaiDao.getInstance().deleteBeforeTime(MonitorCallbackManager.getInstance().currentTimeSec() - 3600, i);
            List<DaBaiBean> limit = DaBaiDao.getInstance().getLimit(300, i);
            if (limit.isEmpty()) {
                this.mIsReporting = false;
                return;
            }
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (DaBaiBean daBaiBean : limit) {
                arrayList.add(Long.valueOf(daBaiBean.id));
                if (daBaiBean.counter <= 0) {
                    daBaiBean.counter = 1;
                }
                daBaiBean2Metric(arrayList2, daBaiBean);
                if (arrayList.size() > 300) {
                    break;
                }
            }
            String encryptGZIP = encryptGZIP(new Gson().toJson(arrayList2));
            if (TextUtils.isEmpty(encryptGZIP)) {
                this.isReporting = false;
            } else {
                d.a(new a<String>() { // from class: com.meituan.android.legwork.monitor.report.channel.model.ReportChannelDaBai.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.legwork.net.subscriber.a
                    public final /* synthetic */ void a(String str) {
                        Object[] objArr2 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c839e1e4010f6cb528e53f94dd564f1a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c839e1e4010f6cb528e53f94dd564f1a");
                            return;
                        }
                        aVar.a(arrayList);
                        ReportChannelDaBai.this.mIsReporting = false;
                    }

                    @Override // com.meituan.android.legwork.net.subscriber.a
                    public final void a(boolean z, int i2, String str) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "25919a8382e9554b874d42f8f6116cbb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "25919a8382e9554b874d42f8f6116cbb");
                        } else {
                            ReportChannelDaBai.this.mIsReporting = false;
                        }
                    }
                }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).reportMetrics(encryptGZIP).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.schedulers.a.e()));
            }
        }
    }

    public static String encryptGZIP(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cd2879bf10f0ef799c9a3e7798b34084", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cd2879bf10f0ef799c9a3e7798b34084");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("UTF-8"));
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return Base64.encodeBytes(byteArray, 8);
        } catch (UnsupportedEncodingException e) {
            x.c("ReportChannelDaBai.encryptGZIP", "UnsupportedEncodingException: " + e.getLocalizedMessage());
            return null;
        } catch (IOException e2) {
            x.c("ReportChannelDaBai.encryptGZIP", "IOException: " + e2.getLocalizedMessage());
            return null;
        }
    }

    private void daBaiBean2Metric(List<DaBaiMetric> list, DaBaiBean daBaiBean) {
        boolean z = false;
        Object[] objArr = {list, daBaiBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45d2a153a21af7334d62fc4ff3065948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45d2a153a21af7334d62fc4ff3065948");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.monitor.d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "b7f35575d42173c13964736aa62fb40d", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "b7f35575d42173c13964736aa62fb40d")).booleanValue();
        } else if (z.b(com.meituan.android.legwork.a.a(), "use_monitor_time", 1) == 1) {
            z = true;
        }
        if (z) {
            for (DaBaiMetric daBaiMetric : list) {
                if (daBaiMetric.tags != null && daBaiMetric.tags.equals(daBaiBean.tags)) {
                    daBaiMetric.addKV(daBaiBean.key, daBaiBean.counter);
                    return;
                }
            }
        }
        DaBaiMetric daBaiMetric2 = new DaBaiMetric();
        daBaiMetric2.tags.putAll(daBaiBean.tags);
        if (z) {
            daBaiMetric2.ts = MonitorCallbackManager.getInstance().currentTimeSec();
        } else {
            daBaiMetric2.ts = daBaiBean.time;
        }
        daBaiMetric2.addKV(daBaiBean.key, daBaiBean.counter);
        list.add(daBaiMetric2);
    }
}
