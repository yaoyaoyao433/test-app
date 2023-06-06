package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AlertFragment extends DialogFragment implements DialogInterface.OnClickListener {
    @Nullable
    private final DialogModule.a a;

    public AlertFragment() {
        this.a = null;
    }

    @SuppressLint({"ValidFragment"})
    public AlertFragment(@Nullable DialogModule.a aVar, Bundle bundle) {
        this.a = aVar;
        setArguments(bundle);
    }

    @Override // android.support.v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Bundle arguments = getArguments();
        AlertDialog.Builder title = new AlertDialog.Builder(activity).setTitle(arguments.getString("title"));
        if (arguments.containsKey("button_positive")) {
            title.setPositiveButton(arguments.getString("button_positive"), this);
        }
        if (arguments.containsKey("button_negative")) {
            title.setNegativeButton(arguments.getString("button_negative"), this);
        }
        if (arguments.containsKey("button_neutral")) {
            title.setNeutralButton(arguments.getString("button_neutral"), this);
        }
        if (arguments.containsKey("message")) {
            title.setMessage(arguments.getString("message"));
        }
        if (arguments.containsKey("items")) {
            title.setItems(arguments.getCharSequenceArray("items"), this);
        }
        return title.create();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.a != null) {
            this.a.onClick(dialogInterface, i);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.a != null) {
            this.a.onDismiss(dialogInterface);
        }
    }
}
