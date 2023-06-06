package com.sankuai.meituan.shortvideocore.config;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DebugView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;

    public DebugView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d20417b98393c0ed581714f839b45a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d20417b98393c0ed581714f839b45a3");
        }
    }

    private DebugView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "039d5954810d882c54d0277914ae5ca4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "039d5954810d882c54d0277914ae5ca4");
        }
    }

    public DebugView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd3c5af81582f0a850180f23c26cd921", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd3c5af81582f0a850180f23c26cd921");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.short_video_debug_view, this);
        this.b = (TextView) findViewById(R.id.title_name);
        this.c = (TextView) findViewById(R.id.first_frame_cost);
    }

    public void setTitleName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f53045ef48acd4413ec7f94daf90c7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f53045ef48acd4413ec7f94daf90c7a");
            return;
        }
        TextView textView = this.b;
        textView.setText("视频名称：" + str);
    }

    public final void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9296b35dd224177589da0527cfff592d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9296b35dd224177589da0527cfff592d");
            return;
        }
        TextView textView = this.c;
        textView.setText("起播时长：" + j + "  视频名称：" + str);
    }
}
