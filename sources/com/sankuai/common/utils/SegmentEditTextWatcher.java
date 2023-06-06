package com.sankuai.common.utils;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SegmentEditTextWatcher implements TextWatcher {
    public static ChangeQuickRedirect changeQuickRedirect;
    private EditText editText;
    private boolean isIgnore;
    private int[] segmentArray;
    private String segmentStr;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public SegmentEditTextWatcher(EditText editText, int[] iArr, String str) {
        Object[] objArr = {editText, iArr, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9625f7b47d4cc0c827b00839c2893b74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9625f7b47d4cc0c827b00839c2893b74");
            return;
        }
        this.editText = editText;
        this.segmentArray = iArr;
        this.segmentStr = str;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f43923e830bc7993b1693334f52035b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f43923e830bc7993b1693334f52035b");
            return;
        }
        try {
            if (this.isIgnore) {
                this.isIgnore = false;
                return;
            }
            String segmentation = MTUtils.segmentation(editable.toString(), this.segmentArray, this.segmentStr);
            if (TextUtils.equals(editable, segmentation)) {
                return;
            }
            this.isIgnore = true;
            this.editText.setText(segmentation);
            this.editText.setSelection(this.editText.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
