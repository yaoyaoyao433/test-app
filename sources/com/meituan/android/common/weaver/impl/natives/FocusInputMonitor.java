package com.meituan.android.common.weaver.impl.natives;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FocusInputMonitor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final NativeEndPoint endPoint;
    @Nullable
    private EditText focusEdit;
    private final TextWatcher watcher;

    public FocusInputMonitor(NativeEndPoint nativeEndPoint) {
        Object[] objArr = {nativeEndPoint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2e22f8f136d8961c5c64ce9f9012943", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2e22f8f136d8961c5c64ce9f9012943");
            return;
        }
        this.watcher = new TextWatcher() { // from class: com.meituan.android.common.weaver.impl.natives.FocusInputMonitor.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5a53b189bb0fb2210b1df776065a6fc9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5a53b189bb0fb2210b1df776065a6fc9");
                    return;
                }
                Logger.getLogger().d("EditText TextChange, onUserTouchView");
                FocusInputMonitor.this.endPoint.onUserTouchView();
                FocusInputMonitor.this.destroy();
            }
        };
        this.endPoint = nativeEndPoint;
    }

    @MainThread
    public void checkFocus(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d07810c2a7fb8dcbc2f962fd144f12f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d07810c2a7fb8dcbc2f962fd144f12f");
            return;
        }
        View findFocus = view.findFocus();
        if (this.focusEdit != null && this.focusEdit != findFocus) {
            destroy();
        }
        if ((findFocus instanceof EditText) && this.focusEdit == null) {
            this.focusEdit = (EditText) findFocus;
            this.focusEdit.addTextChangedListener(this.watcher);
        }
    }

    @MainThread
    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2eb7e034fec0e12582d5dc1f504631fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2eb7e034fec0e12582d5dc1f504631fd");
        } else if (this.focusEdit != null) {
            final EditText editText = this.focusEdit;
            editText.post(new Runnable() { // from class: com.meituan.android.common.weaver.impl.natives.FocusInputMonitor.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0c62d7785d2409bc86c28cfbb6860223", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0c62d7785d2409bc86c28cfbb6860223");
                    } else {
                        editText.removeTextChangedListener(FocusInputMonitor.this.watcher);
                    }
                }
            });
            this.focusEdit = null;
        }
    }
}
