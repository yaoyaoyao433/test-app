package com.meituan.android.common.ui.dialog.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MtDialogOptionWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isSingleChoice;
    private boolean mEnabled;
    private List<MtDialogOption> mMtDialogCheckOptions;

    public MtDialogOptionWrapper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5abe8d41dcf78f8258e2bf018429f498", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5abe8d41dcf78f8258e2bf018429f498");
            return;
        }
        this.mMtDialogCheckOptions = new ArrayList();
        this.mEnabled = true;
    }

    public MtDialogOptionWrapper(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90577583b710940a37eaa96861341409", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90577583b710940a37eaa96861341409");
            return;
        }
        this.mMtDialogCheckOptions = new ArrayList();
        this.mEnabled = true;
        this.isSingleChoice = z;
    }

    public MtDialogOption getOptionAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5a6a86173d2ca2caedc141025464ca6", RobustBitConfig.DEFAULT_VALUE) ? (MtDialogOption) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5a6a86173d2ca2caedc141025464ca6") : this.mMtDialogCheckOptions.get(i);
    }

    public void setOptions(List<CharSequence> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d961509644bbb0d8c4ab6b14291b4b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d961509644bbb0d8c4ab6b14291b4b4");
        } else if (list != null && list.size() != 0) {
            for (CharSequence charSequence : list) {
                if (!TextUtils.isEmpty(charSequence)) {
                    this.mMtDialogCheckOptions.add(new MtDialogOption(charSequence));
                }
            }
        }
    }

    public List<MtDialogOption> getOptions() {
        return this.mMtDialogCheckOptions;
    }

    public void setChecked(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0e3418f88c6f143cb83dbfc5a965944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0e3418f88c6f143cb83dbfc5a965944");
        } else if (i >= this.mMtDialogCheckOptions.size()) {
        } else {
            this.mMtDialogCheckOptions.get(i).setCheck(true);
        }
    }

    public void setChecked(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d11198dc4a2677ce2e19e03dc843a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d11198dc4a2677ce2e19e03dc843a6b");
        } else if (iArr != null && iArr.length != 0) {
            for (int i = 0; i < iArr.length; i++) {
                if (iArr[i] < this.mMtDialogCheckOptions.size()) {
                    this.mMtDialogCheckOptions.get(iArr[i]).setCheck(true);
                }
            }
        }
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void set(MtDialogOptionWrapper mtDialogOptionWrapper) {
        Object[] objArr = {mtDialogOptionWrapper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d914e8c395bd5c669de3898d6afb1625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d914e8c395bd5c669de3898d6afb1625");
            return;
        }
        this.mMtDialogCheckOptions.clear();
        this.mMtDialogCheckOptions.addAll(mtDialogOptionWrapper.getOptions());
        this.mEnabled = mtDialogOptionWrapper.isEnabled();
        this.isSingleChoice = mtDialogOptionWrapper.isSingleChoice;
    }

    public boolean isSingleChoice() {
        return this.isSingleChoice;
    }
}
