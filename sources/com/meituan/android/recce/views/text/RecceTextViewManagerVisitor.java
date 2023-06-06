package com.meituan.android.recce.views.text;

import android.text.TextUtils;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.views.text.ReactTextView;
import com.meituan.android.recce.mrn.uimanager.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceTextViewManagerVisitor extends f<ReactTextView, RecceTextShadowNode, RecceTextViewManager> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RecceTextViewManagerVisitor(RecceTextViewManager recceTextViewManager, ReactTextView reactTextView) {
        Object[] objArr = {recceTextViewManager, reactTextView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5265752fdf3f06ec8df517094680213", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5265752fdf3f06ec8df517094680213");
            return;
        }
        this.viewManager = recceTextViewManager;
        this.view = reactTextView;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitEllipsizeMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c13c68a620631933c6b6cbfe743d031", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c13c68a620631933c6b6cbfe743d031");
        }
        if (i == 2) {
            ((ReactTextView) this.view).setEllipsizeLocation(TextUtils.TruncateAt.END);
        } else if (i == 0) {
            ((ReactTextView) this.view).setEllipsizeLocation(TextUtils.TruncateAt.START);
        } else if (i == 1) {
            ((ReactTextView) this.view).setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
        } else if (i == 3) {
            ((ReactTextView) this.view).setEllipsizeLocation(null);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid ellipsizeMode: " + i);
        }
        return null;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitNumberOfLines(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68af8cfe2efe53a085d465e09ded9445", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68af8cfe2efe53a085d465e09ded9445");
        }
        ((ReactTextView) this.view).setNumberOfLines(i);
        return null;
    }
}
