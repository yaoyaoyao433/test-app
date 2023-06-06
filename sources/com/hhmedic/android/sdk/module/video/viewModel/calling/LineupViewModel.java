package com.hhmedic.android.sdk.module.video.viewModel.calling;

import android.content.Context;
import android.view.View;
import com.hhmedic.android.sdk.module.video.widget.calling.LineupView;
import com.hhmedic.android.sdk.uikit.utils.HHUIUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class LineupViewModel extends CallViewModel {
    private LineupView mLineupView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LineupViewModel(Context context) {
        super(context);
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.calling.CallViewModel
    public final void updateTips(String str) {
        if (this.mLineupView != null) {
            this.mLineupView.updateTips(str);
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.calling.CallViewModel
    public final void release() {
        clearListener();
        if (this.mLineupView != null) {
            this.mLineupView.stopWait();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.viewModel.calling.CallViewModel
    public final void stopUI() {
        if (this.mLineupView != null) {
            this.mLineupView.stopWait();
        }
    }

    @Override // com.hhmedic.android.sdk.module.video.widget.calling.CallingView.CallingWidget
    public final View getCallingContent() {
        this.mLineupView = new LineupView(this.mContext);
        this.mLineupView.addOnCancelClick(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.viewModel.calling.LineupViewModel.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LineupViewModel.this.doCancelLineupClick();
            }
        });
        this.mLineupView.loadLineupImage();
        this.mLineupView.startWait();
        return this.mLineupView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doCancelLineupClick() {
        if (HHUIUtils.isFastClick() || this.mListener == null) {
            return;
        }
        this.mListener.onCancelClick();
    }
}
