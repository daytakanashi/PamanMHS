package com.rhidayat.pamanmhs;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class SettingsFragment extends PreferenceFragment {


    public SettingsFragment() {
    }

    static int del = 0, cre = 0, upd = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.tab_settings);

        settingPref();

    }

    private void settingPref() {

        Preference aboutPref = findPreference(getString(R.string.key_about));
        CheckBoxPreference checkboxPref = (CheckBoxPreference) findPreference(getString(R.string.key_checkbox));
        SwitchPreference switchPref = (SwitchPreference) findPreference(getString(R.string.key_switch));
        aboutPref.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Toast.makeText(getActivity(), "HUMANIKA UYP JAYA", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        switchPref.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {

                if ((Boolean) newValue) {
                    Toast.makeText(getActivity(), "Notifikasi Hidup", Toast.LENGTH_SHORT).show();
                    del = 1; cre = 1; upd = 1;

                } else {
                    Toast.makeText(getActivity(), "Toast Hidup", Toast.LENGTH_SHORT).show();
                    del = 0; cre = 0; upd = 0;
                }

                return true;
            }
        });


    }
}