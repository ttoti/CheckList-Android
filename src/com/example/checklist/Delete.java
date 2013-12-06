package com.example.checklist;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class Delete extends DialogFragment{
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState){
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setMessage(R.string.dialog_delete)
			.setPositiveButton(R.string.delete, new DialogInterface.OnClickListener(){
			public void onClick(DialogInterface dialog, int id){
					
				}
			})
			.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface dialog, int id){
					
				}
			});
		return builder.create();
		}
}