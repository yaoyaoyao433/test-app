package android.support.v4.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.v4.app.RemoteInputCompatBase;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class RemoteInput extends RemoteInputCompatBase.RemoteInput {
    private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final RemoteInputCompatBase.RemoteInput.Factory FACTORY;
    private static final Impl IMPL;
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    private static final String TAG = "RemoteInput";
    private final boolean mAllowFreeFormTextInput;
    private final Set<String> mAllowedDataTypes;
    private final CharSequence[] mChoices;
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    interface Impl {
        void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map);

        void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle);

        Map<String, Uri> getDataResultsFromIntent(Intent intent, String str);

        Bundle getResultsFromIntent(Intent intent);
    }

    RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle, Set<String> set) {
        this.mResultKey = str;
        this.mLabel = charSequence;
        this.mChoices = charSequenceArr;
        this.mAllowFreeFormTextInput = z;
        this.mExtras = bundle;
        this.mAllowedDataTypes = set;
    }

    @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput
    public final String getResultKey() {
        return this.mResultKey;
    }

    @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput
    public final CharSequence getLabel() {
        return this.mLabel;
    }

    @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput
    public final CharSequence[] getChoices() {
        return this.mChoices;
    }

    @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput
    public final Set<String> getAllowedDataTypes() {
        return this.mAllowedDataTypes;
    }

    public final boolean isDataOnly() {
        if (getAllowFreeFormInput()) {
            return false;
        }
        return ((getChoices() != null && getChoices().length != 0) || getAllowedDataTypes() == null || getAllowedDataTypes().isEmpty()) ? false : true;
    }

    @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput
    public final boolean getAllowFreeFormInput() {
        return this.mAllowFreeFormTextInput;
    }

    @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput
    public final Bundle getExtras() {
        return this.mExtras;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class Builder {
        private CharSequence[] mChoices;
        private CharSequence mLabel;
        private final String mResultKey;
        private boolean mAllowFreeFormTextInput = true;
        private Bundle mExtras = new Bundle();
        private final Set<String> mAllowedDataTypes = new HashSet();

        public Builder(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.mResultKey = str;
        }

        public final Builder setLabel(CharSequence charSequence) {
            this.mLabel = charSequence;
            return this;
        }

        public final Builder setChoices(CharSequence[] charSequenceArr) {
            this.mChoices = charSequenceArr;
            return this;
        }

        public final Builder setAllowDataType(String str, boolean z) {
            if (z) {
                this.mAllowedDataTypes.add(str);
            } else {
                this.mAllowedDataTypes.remove(str);
            }
            return this;
        }

        public final Builder setAllowFreeFormInput(boolean z) {
            this.mAllowFreeFormTextInput = z;
            return this;
        }

        public final Builder addExtras(Bundle bundle) {
            if (bundle != null) {
                this.mExtras.putAll(bundle);
            }
            return this;
        }

        public final Bundle getExtras() {
            return this.mExtras;
        }

        public final RemoteInput build() {
            return new RemoteInput(this.mResultKey, this.mLabel, this.mChoices, this.mAllowFreeFormTextInput, this.mExtras, this.mAllowedDataTypes);
        }
    }

    public static Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
        return IMPL.getDataResultsFromIntent(intent, str);
    }

    public static Bundle getResultsFromIntent(Intent intent) {
        return IMPL.getResultsFromIntent(intent);
    }

    public static void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
        IMPL.addResultsToIntent(remoteInputArr, intent, bundle);
    }

    public static void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
        IMPL.addDataResultToIntent(remoteInput, intent, map);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ImplBase implements Impl {
        @Override // android.support.v4.app.RemoteInput.Impl
        public void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
            return null;
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public Bundle getResultsFromIntent(Intent intent) {
            return null;
        }

        ImplBase() {
        }
    }

    /* compiled from: ProGuard */
    @RequiresApi(16)
    /* loaded from: classes.dex */
    public static class ImplJellybean implements Impl {
        ImplJellybean() {
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public Bundle getResultsFromIntent(Intent intent) {
            return RemoteInputCompatJellybean.getResultsFromIntent(intent);
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
            return RemoteInputCompatJellybean.getDataResultsFromIntent(intent, str);
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
            RemoteInputCompatJellybean.addResultsToIntent(remoteInputArr, intent, bundle);
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            RemoteInputCompatJellybean.addDataResultToIntent(remoteInput, intent, map);
        }
    }

    /* compiled from: ProGuard */
    @RequiresApi(20)
    /* loaded from: classes.dex */
    public static class ImplApi20 implements Impl {
        ImplApi20() {
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public Bundle getResultsFromIntent(Intent intent) {
            return RemoteInputCompatApi20.getResultsFromIntent(intent);
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
            return RemoteInputCompatApi20.getDataResultsFromIntent(intent, str);
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
            RemoteInputCompatApi20.addResultsToIntent(remoteInputArr, intent, bundle);
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            RemoteInputCompatApi20.addDataResultToIntent(remoteInput, intent, map);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 20) {
            IMPL = new ImplApi20();
        } else if (Build.VERSION.SDK_INT >= 16) {
            IMPL = new ImplJellybean();
        } else {
            IMPL = new ImplBase();
        }
        FACTORY = new RemoteInputCompatBase.RemoteInput.Factory() { // from class: android.support.v4.app.RemoteInput.1
            @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory
            public final /* bridge */ /* synthetic */ RemoteInputCompatBase.RemoteInput build(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle, Set set) {
                return build(str, charSequence, charSequenceArr, z, bundle, (Set<String>) set);
            }

            @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory
            public final RemoteInput build(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle, Set<String> set) {
                return new RemoteInput(str, charSequence, charSequenceArr, z, bundle, set);
            }

            @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory
            public final RemoteInput[] newArray(int i) {
                return new RemoteInput[i];
            }
        };
    }
}
