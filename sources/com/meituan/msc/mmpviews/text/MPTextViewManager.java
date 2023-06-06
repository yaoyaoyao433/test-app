package com.meituan.msc.mmpviews.text;

import android.os.Build;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.view.View;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.ai;
import com.meituan.msc.uimanager.f;
import com.meituan.msc.views.precreate.c;
import com.meituan.msc.views.text.i;
import com.meituan.msc.views.text.j;
import com.meituan.msc.views.text.m;
import com.meituan.msc.views.text.o;
import com.meituan.msc.views.text.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = "MSCText")
/* loaded from: classes3.dex */
public class MPTextViewManager extends MPTextAnchorViewManager<MPTextView, MPTextShadowNode> implements f {
    public static ChangeQuickRedirect b;
    @Nullable
    protected j c;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "MSCText";
    }

    @Override // com.meituan.msc.uimanager.f
    public final boolean h() {
        return true;
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e64496c11f11e60521034bcae64187c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e64496c11f11e60521034bcae64187c5");
        }
        long nanoTime = System.nanoTime();
        MPTextView tryGetMPTextView = themedReactContext.getRuntimeDelegate().tryGetMPTextView(themedReactContext);
        c.d++;
        c.A += System.nanoTime() - nanoTime;
        return tryGetMPTextView;
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ Object a(View view, ab abVar, @Nullable ai aiVar) {
        a aVar;
        Spannable spannable;
        MPTextView mPTextView = (MPTextView) view;
        Object[] objArr = {mPTextView, abVar, aiVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "377ded4f941caa55634cc4c4c99bd206", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "377ded4f941caa55634cc4c4c99bd206");
        }
        if (aiVar == null) {
            return null;
        }
        ReadableMap a = aiVar.a();
        ReadableMap map = a.getMap("attributedString");
        ReadableMap map2 = a.getMap("paragraphAttributes");
        if (a.hasKey("isLeafNode") && a.getBoolean("isLeafNode") && map != null) {
            spannable = null;
            aVar = q.a(mPTextView.getContext(), map, this.c);
        } else if (map != null) {
            aVar = null;
            spannable = q.b(mPTextView.getContext(), map, this.c);
        } else {
            aVar = null;
            spannable = null;
        }
        return new i(aVar, spannable, a.hasKey("mostRecentEventCount") ? a.getInt("mostRecentEventCount") : -1, false, m.a(abVar), (map2 == null || map2.getString("textBreakStrategy") == null) ? Build.VERSION.SDK_INT < 23 ? 0 : 1 : m.a(map2.getString("textBreakStrategy")), m.b(abVar));
    }

    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager, com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view) {
        MPTextView mPTextView = (MPTextView) view;
        Object[] objArr = {mPTextView};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3b9856a68c8bb2029eb0e4cfeb76eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3b9856a68c8bb2029eb0e4cfeb76eb");
        } else {
            super.a((MPTextViewManager) mPTextView);
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager, com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view, Object obj) {
        MPTextView mPTextView = (MPTextView) view;
        Object[] objArr = {mPTextView, obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "345c713ead877e295e73960b1f5b680d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "345c713ead877e295e73960b1f5b680d");
        } else if (obj != null) {
            i iVar = (i) obj;
            if (iVar.d) {
                o.a(iVar.c, mPTextView.getImpl());
            }
            mPTextView.setText(iVar);
        }
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ aa d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33dbd222feacd4f14fb31a479b3f1493", RobustBitConfig.DEFAULT_VALUE) ? (MPTextShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33dbd222feacd4f14fb31a479b3f1493") : new MPTextShadowNode();
    }

    @Override // com.meituan.msc.uimanager.as
    public final Class<MPTextShadowNode> c() {
        return MPTextShadowNode.class;
    }

    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager, com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    @Nullable
    public final Map b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c68cc35724e8becd810feb8332e5369", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c68cc35724e8becd810feb8332e5369") : com.meituan.msc.jse.common.a.a("topTextLayout", com.meituan.msc.jse.common.a.a("registrationName", "onTextLayout"), "topInlineViewLayout", com.meituan.msc.jse.common.a.a("registrationName", "onInlineViewLayout"));
    }
}
