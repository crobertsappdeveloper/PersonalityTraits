/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 */
package com.example.android.personalitytraits;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * This app creates a personality test result based on characteristics selected in checkboxes.
 */
public class MainActivity extends AppCompatActivity {

    /* Sets global variables so these can be used in all methods below */
    int introversion = 0;
    int extroversion = 0;
    String result = "";

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Results is clicked.
     */
    public void getResults(View view) {
        displayMessage(createResults(result));

    }

    private String createResults (String result) {
        /* Returns the value of the checkbox from the ID from activity main. With the checkbox being cast using (Checkbox) */
        CheckBox passionateCheckBox = (CheckBox) findViewById(R.id.passionate);
        CheckBox outgoingCheckBox = (CheckBox) findViewById(R.id.outgoing);
        CheckBox imaginativeCheckBox = (CheckBox) findViewById(R.id.imaginative);
        CheckBox reservedCheckBox = (CheckBox) findViewById(R.id.reserved);
        CheckBox jovialCheckBox = (CheckBox) findViewById(R.id.jovial);
        CheckBox seriousCheckBox = (CheckBox) findViewById(R.id.serious);
        CheckBox energeticCheckBox = (CheckBox) findViewById(R.id.energetic);
        CheckBox relaxedCheckBox = (CheckBox) findViewById(R.id.relaxed);
        CheckBox daringCheckBox = (CheckBox) findViewById(R.id.daring);
        CheckBox anxiousCheckBox = (CheckBox) findViewById(R.id.anxious);

        /* Stores whether the Checkbox has been ticked or not in a boolean true/false variable with only two possible values */
        boolean isPassionate = passionateCheckBox.isChecked();
        boolean isOutgoing = outgoingCheckBox.isChecked();
        boolean isImaginative = imaginativeCheckBox.isChecked();
        boolean isReserved = reservedCheckBox.isChecked();
        boolean isJovial = jovialCheckBox.isChecked();
        boolean isSerious = seriousCheckBox.isChecked();
        boolean isEnergetic = energeticCheckBox.isChecked();
        boolean isRelaxed = relaxedCheckBox.isChecked();
        boolean isDaring = daringCheckBox.isChecked();
        boolean isAnxious = anxiousCheckBox.isChecked();

        /* Checks for introvert and extrovert traits from the boxes clicked and increases value by 1 for each characteristic */
        if (isPassionate) {
            extroversion = extroversion + 1;
        }

        if (isOutgoing) {
            extroversion = extroversion + 1;
        }

        if (isImaginative) {
            introversion = introversion + 1;
        }

        if (isReserved) {
            introversion = introversion + 1;
        }

        if (isJovial) {
            extroversion = extroversion + 1;
        }

        if (isSerious) {
            introversion = introversion + 1;
        }

        if (isEnergetic) {
            extroversion = extroversion + 1;
        }

        if (isRelaxed) {
            introversion = introversion + 1;
        }

        if (isDaring) {
            extroversion = extroversion + 1;
        }

        if (isAnxious) {
            introversion = introversion + 1;
        }

        /* Works out the result or characteristic based on the values calculated above */
        if (introversion > extroversion) {
            result = "PLEASE SEE YOUR RESULTS HERE: Introvert";
            result += "\n\nYou are energised by spending time alone being creative preferring quite and peaceful environments to those that are too noisy or overstimulating.";
        }

        if (extroversion > introversion) {
            result = "PLEASE SEE YOUR RESULTS HERE: Extrovert";
            result += "\n\nYou are energised by spending time socialising with other people. You are drawn to new experiences and are quite animated and outspoken.";
        }

        if (extroversion == introversion) {
            result = "PLEASE SEE YOUR RESULTS HERE: Ambivert";
            result += "\n\nYou are the perfect mixture of both introvert and extrovert. You are not extreme in either of these and have a good balance of both personality traits. Where you can both spend time alone to relax and also enjoy socialising in large groups.";
        }

        /* Returns the result on the screen in the appropriate section defined in the findviewbyid in displayMessage */
        return result;
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.result_text_view);
        orderSummaryTextView.setText(message);
    }

    public void ResetValues(View view) {
        /* Gets the values of the checkboxes*/
        CheckBox passionateCheckBox = (CheckBox) findViewById(R.id.passionate);
        CheckBox outgoingCheckBox = (CheckBox) findViewById(R.id.outgoing);
        CheckBox imaginativeCheckBox = (CheckBox) findViewById(R.id.imaginative);
        CheckBox reservedCheckBox = (CheckBox) findViewById(R.id.reserved);
        CheckBox jovialCheckBox = (CheckBox) findViewById(R.id.jovial);
        CheckBox seriousCheckBox = (CheckBox) findViewById(R.id.serious);
        CheckBox energeticCheckBox = (CheckBox) findViewById(R.id.energetic);
        CheckBox relaxedCheckBox = (CheckBox) findViewById(R.id.relaxed);
        CheckBox daringCheckBox = (CheckBox) findViewById(R.id.daring);
        CheckBox anxiousCheckBox = (CheckBox) findViewById(R.id.anxious);

        /* Unchecks all the checkboxes */
        if (passionateCheckBox.isChecked()) {
            passionateCheckBox.setChecked(false);
        }
        if (outgoingCheckBox.isChecked()) {
            outgoingCheckBox.setChecked(false);
        }
        if (imaginativeCheckBox.isChecked()) {
            imaginativeCheckBox.setChecked(false);
        }
        if (reservedCheckBox.isChecked()) {
            reservedCheckBox.setChecked(false);
        }
        if (jovialCheckBox.isChecked()) {
            jovialCheckBox.setChecked(false);
        }
        if (seriousCheckBox.isChecked()) {
            seriousCheckBox.setChecked(false);
        }
        if (energeticCheckBox.isChecked()) {
            energeticCheckBox.setChecked(false);
        }
        if (relaxedCheckBox.isChecked()) {
            relaxedCheckBox.setChecked(false);
        }
        if (daringCheckBox.isChecked()) {
            daringCheckBox.setChecked(false);
        }
        if (anxiousCheckBox.isChecked()) {
            anxiousCheckBox.setChecked(false);
        }

        /* Puts the results textview back to what it was originally */
        result = "PLEASE SEE YOUR RESULTS HERE:";
        displayMessage(result);

        /* Resets the global variables back to 0 */
        introversion = 0;
        extroversion = 0;
    }
}
