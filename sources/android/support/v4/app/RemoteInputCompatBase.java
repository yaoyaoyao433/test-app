package android.support.v4.app;

import android.os.Bundle;
import java.util.Set;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes.dex */
public class RemoteInputCompatBase {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class RemoteInput {

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public interface Factory {
            RemoteInput build(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle, Set<String> set);

            RemoteInput[] newArray(int i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract boolean getAllowFreeFormInput();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract Set<String> getAllowedDataTypes();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract CharSequence[] getChoices();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract Bundle getExtras();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract CharSequence getLabel();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract String getResultKey();
    }

    RemoteInputCompatBase() {
    }
}
