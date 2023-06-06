package com.meituan.android.common.ui.dialog.model;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MtCommonDialogParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context mContext;
    private CharSequence mMessage;
    private int mMessageResId;
    private DialogInterface.OnClickListener mNegativeButtonListener;
    private CharSequence mNegativeButtonText;
    private int mNegativeResId;
    private DialogInterface.OnClickListener mPositiveButtonListener;
    private CharSequence mPositiveButtonText;
    private int mPositiveResId;
    private CharSequence mTitle;
    private int mTitleResId;

    public MtCommonDialogParams(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5acd231c873978cd96c1fafb0b855941", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5acd231c873978cd96c1fafb0b855941");
            return;
        }
        this.mTitleResId = -1;
        this.mMessageResId = -1;
        this.mPositiveResId = -1;
        this.mNegativeResId = -1;
        this.mContext = context;
    }

    public CharSequence getTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b35f336a551f82f53196fb1ed451860", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b35f336a551f82f53196fb1ed451860") : this.mTitleResId != -1 ? this.mContext.getString(this.mTitleResId) : this.mTitle;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        this.mTitleResId = -1;
    }

    public void setTitle(int i) {
        this.mTitleResId = i;
        this.mTitle = null;
    }

    public CharSequence getMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02f61b1580ae763db7f8d7af214170a8", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02f61b1580ae763db7f8d7af214170a8") : this.mMessageResId != -1 ? this.mContext.getString(this.mMessageResId) : this.mMessage;
    }

    public void setMessage(CharSequence charSequence) {
        this.mMessage = charSequence;
        this.mMessageResId = -1;
    }

    public void setMessage(int i) {
        this.mMessageResId = i;
        this.mMessage = null;
    }

    public CharSequence getPositiveButtonText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00053e6792a09ec9bddd398601ff7770", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00053e6792a09ec9bddd398601ff7770") : this.mPositiveResId != -1 ? this.mContext.getString(this.mPositiveResId) : this.mPositiveButtonText;
    }

    public void setPositiveButtonText(int i) {
        this.mPositiveResId = i;
        this.mPositiveButtonText = null;
    }

    public void setPositiveButtonText(CharSequence charSequence) {
        this.mPositiveButtonText = charSequence;
        this.mPositiveResId = -1;
    }

    public void setPositiveListener(DialogInterface.OnClickListener onClickListener) {
        this.mPositiveButtonListener = onClickListener;
    }

    public CharSequence getNegativeButtonText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1258bbd9f5fde5f35386832472d4da1a", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1258bbd9f5fde5f35386832472d4da1a") : this.mNegativeResId != -1 ? this.mContext.getString(this.mNegativeResId) : this.mNegativeButtonText;
    }

    public void setNegativeButtonText(int i) {
        this.mNegativeResId = i;
        this.mNegativeButtonText = null;
    }

    public void setNegativeButtonText(CharSequence charSequence) {
        this.mNegativeButtonText = charSequence;
        this.mNegativeResId = -1;
    }

    public void setNegativeListener(DialogInterface.OnClickListener onClickListener) {
        this.mNegativeButtonListener = onClickListener;
    }

    public DialogInterface.OnClickListener getPositiveListener() {
        return this.mPositiveButtonListener;
    }

    public DialogInterface.OnClickListener getNegativeListener() {
        return this.mNegativeButtonListener;
    }

    public boolean haveButton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f44f6e5cce68f382a3cac006ad0ebe4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f44f6e5cce68f382a3cac006ad0ebe4")).booleanValue() : (getPositiveButtonText() == null && getNegativeButtonText() == null) ? false : true;
    }
}
