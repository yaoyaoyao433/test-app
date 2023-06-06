package com.meituan.msc.modules.api.msi.components.coverview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.JsonObject;
import com.meituan.msc.common.utils.n;
import com.meituan.msc.modules.api.msi.components.coverview.params.MSCCoverTextViewParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends MSCTextView implements com.meituan.msc.modules.api.msi.b {
    public static ChangeQuickRedirect a;
    public com.meituan.msc.modules.api.msi.e b;

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "add0e1878c06246bc27057f21a30338c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "add0e1878c06246bc27057f21a30338c");
        }
    }

    @Override // com.meituan.msc.modules.api.msi.b
    public final void setViewContext(com.meituan.msc.modules.api.msi.e eVar) {
        this.b = eVar;
    }

    public final com.meituan.msc.modules.api.msi.e getViewContext() {
        return this.b;
    }

    public final void a(final MSCCoverTextViewParams mSCCoverTextViewParams) {
        boolean z = true;
        Object[] objArr = {mSCCoverTextViewParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "963297d15a71f03179c1b84f41fecf0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "963297d15a71f03179c1b84f41fecf0f");
            return;
        }
        a(mSCCoverTextViewParams.label);
        boolean z2 = mSCCoverTextViewParams.clickable != null && mSCCoverTextViewParams.clickable.booleanValue();
        z = (mSCCoverTextViewParams.gesture == null || !mSCCoverTextViewParams.gesture.booleanValue()) ? false : false;
        MSCCoverViewTouchHelper.a(this, getViewContext(), mSCCoverTextViewParams.gesture);
        if (mSCCoverTextViewParams.clickable != null) {
            if (!z && z2) {
                setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.api.msi.components.coverview.g.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3aa574a2017e313e39b0edb752a25ab", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3aa574a2017e313e39b0edb752a25ab");
                            return;
                        }
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.add("data", mSCCoverTextViewParams.data);
                        g.this.b.a("onTextViewClick", jsonObject);
                    }
                });
            } else {
                setOnClickListener(null);
            }
        }
    }

    private void a(MSCCoverTextViewParams.Label label) {
        Object[] objArr = {label};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3adce0d0e3d1f5f552ec0542c9adace3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3adce0d0e3d1f5f552ec0542c9adace3");
        } else if (label != null) {
            String str = label.color;
            if (!TextUtils.isEmpty(str)) {
                setTextColor(com.meituan.msc.common.utils.g.b(str));
            }
            if (label.fontSize != null) {
                setTextSize(1, label.fontSize.floatValue());
            }
            String str2 = label.textAlign;
            if ("left".equals(str2)) {
                setGravity(3);
            } else if ("center".equals(str2)) {
                setGravity(17);
            } else if ("right".equals(str2)) {
                setGravity(5);
            }
            String str3 = label.fontWeight;
            if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(str3)) {
                setFakeBoldText(true);
            } else if ("normal".equals(str3)) {
                setFakeBoldText(false);
            }
            String str4 = label.lineBreak;
            if ("ellipsis".equals(str4)) {
                setEllipsize(TextUtils.TruncateAt.END);
                setSingleLine(true);
            } else if ("clip".equals(str4)) {
                setSingleLine(true);
            } else if ("break-word".equals(str4)) {
                setSingleLine(false);
            } else if ("break-all".equals(str4)) {
                setSingleLine(false);
            }
            a(this, label);
            setText(label.content);
        }
    }

    private void a(MSCTextView mSCTextView, MSCCoverTextViewParams.Label label) {
        Object[] objArr = {mSCTextView, label};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a7f4baf950ed72a55ce4fb17fc95704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a7f4baf950ed72a55ce4fb17fc95704");
        } else if (label.lineHeight != null) {
            mSCTextView.setLineHeightEx(n.e(label.lineHeight.floatValue()));
        } else {
            mSCTextView.setLineHeightEx(Math.round(mSCTextView.getTextSize() * 1.2f));
        }
    }
}
