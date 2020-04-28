package com.example.android.afinal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TutorialActivity extends AppCompatActivity {
    private List<Tutorial> tutorials;
    private TutorialAdapter tutorialsAdapter;
    private RecyclerView recyclerView;
    private List<String> videoIntro;
    private List<String> link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        setTitle("Tutorials List");

        initialData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        tutorialsAdapter = new TutorialAdapter(tutorials, this, link);
        recyclerView.setAdapter(tutorialsAdapter);

    }

    private void initialData() {
        tutorials = new ArrayList<>();
        tutorials.add(new Tutorial(R.drawable.e1, getString(R.string.ep1), getString(R.string.dur1)));
        tutorials.add(new Tutorial(R.drawable.e2, getString(R.string.ep2), getString(R.string.dur2)));
        tutorials.add(new Tutorial(R.drawable.e3, getString(R.string.ep3), getString(R.string.dur3)));
        tutorials.add(new Tutorial(R.drawable.e4, getString(R.string.ep4), getString(R.string.dur4)));
        tutorials.add(new Tutorial(R.drawable.e5, getString(R.string.ep5), getString(R.string.dur5)));
        tutorials.add(new Tutorial(R.drawable.e6, getString(R.string.ep6), getString(R.string.dur6)));
        tutorials.add(new Tutorial(R.drawable.e7, getString(R.string.ep7), getString(R.string.dur7)));
        tutorials.add(new Tutorial(R.drawable.e8, getString(R.string.ep8), getString(R.string.dur8)));
        tutorials.add(new Tutorial(R.drawable.e9, getString(R.string.ep9), getString(R.string.dur9)));
        tutorials.add(new Tutorial(R.drawable.e10, getString(R.string.ep10), getString(R.string.dur10)));
        tutorials.add(new Tutorial(R.drawable.e11, getString(R.string.ep11), getString(R.string.dur11)));
        tutorials.add(new Tutorial(R.drawable.e12, getString(R.string.ep12), getString(R.string.dur12)));
        tutorials.add(new Tutorial(R.drawable.e13, getString(R.string.ep13), getString(R.string.dur13)));
        tutorials.add(new Tutorial(R.drawable.e14, getString(R.string.ep14), getString(R.string.dur14)));
        tutorials.add(new Tutorial(R.drawable.e15, getString(R.string.ep15), getString(R.string.dur15)));
        tutorials.add(new Tutorial(R.drawable.e16, getString(R.string.ep16), getString(R.string.dur16)));

        link = new ArrayList<>();
        link.add("QaHk70PVgr0!INTRODUCTION\nStrive for the highest contact point is one of the most important tips in playing badminton, which could be achieve via better control of the shuttle based on judgment, footwork, and position selection. ");
        link.add("C_lbFaIbJi4!INTRODUCTION\nWhen returning backhand shot at frontcourt, players should make full use of the fingers to grip the racket from a loose state to a tight state, and generate power by pushing the thumb forward. Players only need to twist the forearm inward to drive the wrist, instead of largely swing the entire arm. With this technique, players can easily make crosscourt shots or slice shots by slightly adjusting the angle of the racket surface and their strength. ");
        link.add("8Ayrx0II0oQ!INTRODUCTION\nBackcourt backhand footwork consists of either two or three steps. At the initial movement, the right foot should move half a step in front of the left foot, to help turn the body. Hit the backhand at the same time as the final step lands on the ground. This not only helps generate power, but also makes it easier to return back after the shot. \n" +
                "To hit a backhand far, players must use finger power, concentrate on generating power and take a bigger backswing, with the contact point in front of the body. \n" );
        link.add("WEGnl6zBzvI!INTRODUCTION\nDepending on how far away the shuttle is, players can take one, two, or three steps frontcourt footwork. At the final step, players need to kick out to make sure the angle behind the knee is greater than 90 degrees and land on the heel with toes pointing outwards. ");
        link.add("04Y013bEazE!INTRODUCTION\nThe best contact point for backcourt clears is just in front of your right shoulder. The contact point for backcourt drops and slices is about 10cm further in front and the contact point for smashes is about another 10cm further. \n" +
                "Backcourt forehand slice technique: when hitting the shuttle, guide with wrist and twist the racquet with fingers to generate power. At the moment of impact, there is a slicing motion. \n");
        link.add("Ga7Acqde8E8!INTRODUCTION\nService Rules:\n" +
                "1.\tFrom the start until the end of the stroke, both feet should be in contact with the floor and may not move. \n" +
                "2.\tAt the moment of contact, the entire shuttle should be below the waist.\n" +
                "3.\tAt the moment of contact, the racquet shaft should be pointing downwards and the racquet head should be clearly below the handle. \n");
        link.add("GJ4qvdCpknY!INTRODUCTION\nTo prepare for service, turn your body so that your front shoulder points towards the net, rotate your body as swing the racquet, and shift your weight forwards from back foot to front foot.");
        link.add("JVu5mje7y0w!INTRODUCTION\nPlayers need to use the strength of ankle and lower leg to push off. Acceleration relies on explosiveness in pushing off against the ground. Most professional players make a small jump to increase the power of their push off against the ground.");
        link.add("bzMAhntWkcM!INTRODUCTION\nIn mixed doubles, the female player should be at the frontcourt guarding the net. The male player is responsible for the mid and backcourt. This is the basic front/back offensive position.");
        link.add("pCXDQmfNIZw!INTRODUCTION\nIn mixed doubles, the female player should have the awareness to get to the net and do whatever is necessary to control the net area. When the male player attacks from the backcourt, the female player guards the net and should be aware of covering any straight returns from the opponents.");
        link.add("JW3slJKbhHU!INTRODUCTION\nFor female players, drop shot is a very effective backcourt technique that requires less power than clearing and smashing. This episode also teaches female players how to move from the back corner to the front opposite corner with effective steps.");
        link.add("7LySouKNwcc!INTRODUCTION\nIn badminton, chop shot is the only technique that makes the shuttle rotates. Similar to the rationale of backcourt clear shot, players need to strive for high contact point and use the fiction of the racket-face to make the shuttle rotates. Watch the demonstration in the video to feel and learn one of the most exquisite techniques in badminton.");
        link.add("TC92uqmbqWU!INTRODUCTION\nThe stopping movement of the arm is emphasized to prevent an overly large stroke action from altering the course of the shuttle. With more practice, players can allow the movement of the swing to be smoother. Preparatory action should be kept small, and there should be a stopping of arm movement during the instant of contact. A good landing point (closer to the net) is based on a good control of slicing the shuttle, instead of reducing the speed of swing.");
        link.add("ndXchVJ1aWI!INTRODUCTION\nA common mistake is a big swinging action of forearm, which results in a lower shuttle speed or even injury. The correct procedure is extending arm towards the shuttle, pronate to hit the shuttle and during the point of contact, tighten the grip with fingers. \n" +
                "Pushing is an attacking shot with the emphasis on speed and deception. Netting, lifting, crosscourt pushing, and straight pushing encompass a similar preparatory action and only a small change of racket-face direction is needed just before the point of contact to launch the shuttle in a desired course.\n");
        link.add("qkN0NwZ9mg8!INTRODUCTION\nThe right foot-in-front stance is most convenient for moving in all directions for right handed players, and the opposite applies for left handed players. In both front and backcourt, the first step should be small, which establishes direction and makes way for a bigger second step.");
        link.add("H-Hggllgcao!INTRODUCTION\nIn singles play, there are six key points in the court, and the court can be divided into regions of three circles. If the shuttle arrives within the closest circle, we can get it in one step. The middle region requires two steps and the furthest circle needs three steps.");

    }
}