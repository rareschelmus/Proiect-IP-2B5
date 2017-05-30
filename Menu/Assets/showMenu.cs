using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class showMenu : MonoBehaviour
{
    List<string> etaj = new List<string>() { "Alege Etaj", "Parter", "Etaj 1", "Etaj 2" };
    List<string> camere_etaj1 = new List<string> { "etaj 1", "C101", "C102", "C103", "C104", "C105", "C106", "C107", "C108", "C109" };
    List<string> camere_etaj2 = new List<string> { "etaj 2", "C201", "C202", "C203", "C204", "C205", "C206", "C207", "C208", "C209" };

    private Dropdown dd_2d_etaj;
    private Dropdown dd_camera1;
    private Dropdown dd_camera2;

    public void Dropdown_IndexChanged_Etaj(int index)
    {
        Debug.Log("Etaj selectat: " + etaj[index]);
        if (index == 1)
        {
            dd_camera1.ClearOptions();
            dd_camera1.AddOptions(camere_etaj1);
        } else if(index == 2)
        {
            dd_camera2.ClearOptions();
            dd_camera2.AddOptions(camere_etaj2);
        }

    }

    public void Dropdown_IndexChanged_camera1(int index)
    {
        Debug.Log("Camera sursa: " + etaj[index]);
    }


    public void Dropdown_IndexChanged_camera2(int index)
    {
        Debug.Log("Camera destinatie: " + etaj[index]);
    }

    void Start()
    {
        Populare();
    }

    void Populare()
    {
        dd_3d_etaj.AddOptions(etaj);
        dd_2d_etaj.AddOptions(etaj);
    }

    void Update()
    {
        //dd_3d_etaj.onValueChanged.AddListener(delegate { showCamera(dd_2d_etaj); });
    }
}
