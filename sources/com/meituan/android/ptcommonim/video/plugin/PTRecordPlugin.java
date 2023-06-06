package com.meituan.android.ptcommonim.video.plugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.video.a;
import com.meituan.android.ptcommonim.video.model.VideoRecordParam;
import com.meituan.android.ptcommonim.video.utils.f;
import com.meituan.android.ptcommonim.video.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
import com.sankuai.xm.imui.session.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTRecordPlugin extends Plugin {
    public static ChangeQuickRedirect a;
    private long b;
    private PTIMCommonBean c;
    private boolean d;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.ptim_expand_panel_video_new;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    @NonNull
    public CharSequence getPluginName() {
        return "拍视频";
    }

    public PTRecordPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c30e8a83e1c3f7711ba002d49b9440fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c30e8a83e1c3f7711ba002d49b9440fe");
        } else {
            this.d = false;
        }
    }

    public PTRecordPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d69b7969e59e657830408553f3622750", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d69b7969e59e657830408553f3622750");
        } else {
            this.d = false;
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b34062b601a06a0386ad7da1e263a1d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b34062b601a06a0386ad7da1e263a1d8");
            return;
        }
        super.d();
        f.a(getContext().getApplicationContext());
    }

    public void setMaxDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4c9c87e1e836d176aec85aa80c3a5ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4c9c87e1e836d176aec85aa80c3a5ab");
        } else {
            this.b = j;
        }
    }

    public void setCommonParamBean(PTIMCommonBean pTIMCommonBean) {
        this.c = pTIMCommonBean;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        JSONObject jSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5532918788b594f42630f9aa7c885993", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5532918788b594f42630f9aa7c885993");
            return;
        }
        super.onAttachedToWindow();
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            jSONObject = b.b(getContext()).a().a();
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        VideoRecordParam videoRecordParam = new VideoRecordParam(jSONObject, this.b);
        PTIMCommonBean pTIMCommonBean = this.c;
        long a2 = videoRecordParam.a();
        Object[] objArr2 = {pTIMCommonBean, jSONObject, new Long(a2)};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4fb3bf5b3a30cc9eafdeed5c271b74af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4fb3bf5b3a30cc9eafdeed5c271b74af");
            return;
        }
        HashMap hashMap = new HashMap();
        Map<String, Object> a3 = g.a(pTIMCommonBean, jSONObject);
        a3.put("video_file_duration", Long.valueOf(a2 / 1000));
        hashMap.putAll(a3);
        Statistics.getChannel("group").writeModelView("pt_common_im_page", "b_group_rqmoz1tg_mv", hashMap, "c_group_74zpfj6k");
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        JSONObject jSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8fee7254c3a6691af062a31c9f64cbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8fee7254c3a6691af062a31c9f64cbe");
            return;
        }
        try {
            jSONObject = b.b(getContext()).a().a();
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        VideoRecordParam videoRecordParam = new VideoRecordParam(jSONObject, this.b);
        Activity activity = getActivity();
        PTIMCommonBean pTIMCommonBean = this.c;
        Object[] objArr2 = {activity, videoRecordParam, pTIMCommonBean};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b8605f04d89f0615b66bb95f827c56d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b8605f04d89f0615b66bb95f827c56d5");
        } else {
            try {
                Intent a2 = a.a(activity);
                a2.putExtra("video_operate_param", videoRecordParam);
                if (pTIMCommonBean != null) {
                    a2.putExtra("video_common_bean", pTIMCommonBean);
                }
                activity.startActivity(a2);
            } catch (Throwable unused2) {
            }
        }
        PTIMCommonBean pTIMCommonBean2 = this.c;
        long a3 = videoRecordParam.a();
        Object[] objArr3 = {pTIMCommonBean2, jSONObject, new Long(a3)};
        ChangeQuickRedirect changeQuickRedirect3 = g.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "bcf614f1e787d8e93db07f1d2741a67b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "bcf614f1e787d8e93db07f1d2741a67b");
            return;
        }
        HashMap hashMap = new HashMap();
        Map<String, Object> a4 = g.a(pTIMCommonBean2, jSONObject);
        a4.put("video_file_duration", Long.valueOf(a3 / 1000));
        hashMap.putAll(a4);
        Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_rqmoz1tg_mc", hashMap, "c_group_74zpfj6k");
    }
}
