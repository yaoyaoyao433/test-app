package com.meituan.android.common.ui.dialog.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MtDialogOption {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isCheck;
    private CharSequence title;

    public MtDialogOption(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c0c785fbfd601816653521f443822ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c0c785fbfd601816653521f443822ad");
        } else {
            this.title = charSequence;
        }
    }

    public MtDialogOption(CharSequence charSequence, boolean z) {
        Object[] objArr = {charSequence, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23f553b699304647e959a71ba1ed3b4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23f553b699304647e959a71ba1ed3b4c");
            return;
        }
        this.title = charSequence;
        this.isCheck = z;
    }

    public boolean isCheck() {
        return this.isCheck;
    }

    public void setCheck(boolean z) {
        this.isCheck = z;
    }

    public CharSequence getTitle() {
        return this.title;
    }

    public void setTitle(CharSequence charSequence) {
        this.title = charSequence;
    }
}
