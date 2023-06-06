package com.sankuai.titans.protocol.webcompat.elements;

import android.view.View;
import android.widget.ProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.titans.protocol.services.IServiceManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ITitleBar {
    View get();

    int getBackgroundColor();

    ProgressBar getProgressBar();

    ITitleContent getTitleContent();

    ITitleBarButton getTitleLLBtn();

    ITitleBarButton getTitleLRBtn();

    ITitleBarButton getTitleRLBtn();

    ITitleBarButton getTitleRRBtn();

    ITitleContent initTitleContent();

    void initialized(TitleBarInitializedEntity titleBarInitializedEntity, IServiceManager iServiceManager, ITitleBarUISettings iTitleBarUISettings, boolean z);

    boolean isTitleBarBtnCloseDisable();

    boolean isTitleBarBtnCloseShow();

    void setBackgroundColor(int i);

    void setIsTitleBarBtnCloseDisable(boolean z);

    void setProgress(int i);

    void setProgressColor(int i);

    void setTitleBarBtnCloseShow(boolean z);

    void setTitleContent(ITitleContent iTitleContent);

    void showProgressBar(boolean z);

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class TitleBarInitializedEntity {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean isThirdParty;
        public View.OnClickListener llClickListener;
        public View.OnClickListener lrClickListener;
        public String progressBarColor;
        public String title;
        public String titleBarBgColor;
        public View.OnClickListener titleOnClickListener;

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String getTitleBarBgColor() {
            return this.titleBarBgColor;
        }

        public void setTitleBarBgColor(String str) {
            this.titleBarBgColor = str;
        }

        public String getProgressBarColor() {
            return this.progressBarColor;
        }

        public void setProgressBarColor(String str) {
            this.progressBarColor = str;
        }

        public View.OnClickListener getLlClickListener() {
            return this.llClickListener;
        }

        public void setLlClickListener(View.OnClickListener onClickListener) {
            this.llClickListener = onClickListener;
        }

        public View.OnClickListener getLrClickListener() {
            return this.lrClickListener;
        }

        public void setLrClickListener(View.OnClickListener onClickListener) {
            this.lrClickListener = onClickListener;
        }

        public View.OnClickListener getTitleOnClickListener() {
            return this.titleOnClickListener;
        }

        public void setTitleOnClickListener(View.OnClickListener onClickListener) {
            this.titleOnClickListener = onClickListener;
        }

        public boolean isThirdParty() {
            return this.isThirdParty;
        }

        public void setThirdParty(boolean z) {
            this.isThirdParty = z;
        }
    }
}
