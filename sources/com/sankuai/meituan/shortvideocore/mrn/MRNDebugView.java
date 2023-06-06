package com.sankuai.meituan.shortvideocore.mrn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.shortvideocore.mrn.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MRNDebugView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private final TextView b;
    private final TextView c;
    private final TextView d;

    public MRNDebugView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7977d6ce1c0d4a2c4983a926f4d27b7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7977d6ce1c0d4a2c4983a926f4d27b7e");
        }
    }

    private MRNDebugView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f86f99fe927bbb5cfd4a16d28b6c70a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f86f99fe927bbb5cfd4a16d28b6c70a0");
        }
    }

    public MRNDebugView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ebace08613f7fb91729f43d5e60e3b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ebace08613f7fb91729f43d5e60e3b6");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.short_video_mrn_debug_view, this);
        this.b = (TextView) findViewById(R.id.support_h265);
        this.c = (TextView) findViewById(R.id.current_play);
        this.d = (TextView) findViewById(R.id.h265_url_exist);
        boolean a2 = a.a();
        TextView textView = this.b;
        textView.setText("是否支持H265：" + a2);
    }

    public void setH265UrlExist(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bdcbb0270b2f5b05e036efdcccb1508", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bdcbb0270b2f5b05e036efdcccb1508");
            return;
        }
        TextView textView = this.d;
        StringBuilder sb = new StringBuilder("H265URL：");
        sb.append(!TextUtils.isEmpty(str));
        textView.setText(sb.toString());
    }

    public void setCurrentPlayType(f.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "607cdf654e37fe44e9f280b27e1f0a7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "607cdf654e37fe44e9f280b27e1f0a7b");
        } else if (aVar == f.a.H265) {
            this.c.setText("播放：H265");
        } else if (aVar == f.a.H264) {
            this.c.setText("播放：H264");
        } else if (aVar == f.a.SWITCH_H264) {
            this.c.setText("播放：H265异常，切换H264");
        } else {
            this.c.setText("播放：播放状态异常");
        }
    }
}
