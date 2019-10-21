package galva.dataComponents;

public enum ORDER_STATE 
{
	FreshlyReceived {public String toString() { return "Œwierzo przyjête";}},
	DuringGalvanizing {public String toString() { return "W trakcie cynkowania";}},
	ReadyForRelease {public String toString() { return "Gotowe do wydania";}},
	Released {public String toString() { return "Wydane";}};
}
